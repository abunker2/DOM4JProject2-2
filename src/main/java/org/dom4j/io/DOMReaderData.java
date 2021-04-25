package org.dom4j.io;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Branch;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.NamespaceStack;

public class DOMReaderData implements DOMReaderInterface {
	private static DocumentFactory factory;

	private static NamespaceStack namespaceStack;

	public DOMReaderData() {
		this.factory = DefaultDocumentFactory.getInstance();
		this.namespaceStack = new NamespaceStack(factory);
	}

	public DOMReaderData(DocumentFactory factory) {
		this.factory = factory;
		this.namespaceStack = new NamespaceStack(factory);
	}

	public static DocumentFactory getDocumentFactory() {
		return factory;
	}

	public static void setDocumentFactory(DocumentFactory docFactory) {
		factory = docFactory;
		namespaceStack.setDocumentFactory(factory);
	}

	public Document read(org.w3c.dom.Document domDocument) {
		if (domDocument instanceof Document) {
			return (Document) domDocument;
		}

		Document document = createDocument();

		clearNamespaceStack();

		org.w3c.dom.NodeList nodeList = domDocument.getChildNodes();

		for (int i = 0, size = nodeList.getLength(); i < size; i++) {
			readTree(nodeList.item(i), document);
		}

		return document;
	}

	// Implementation methods

	protected static void readTree(org.w3c.dom.Node node, Branch current) {
		Element element = null;
		Document document = null;

		if (current instanceof Element) {
			element = (Element) current;
		} else {
			document = (Document) current;
		}

		switch (node.getNodeType()) {
			case org.w3c.dom.Node.ELEMENT_NODE:
				readElement(node, current);

				break;

			case org.w3c.dom.Node.PROCESSING_INSTRUCTION_NODE:

				if (current instanceof Element) {
					Element currentEl = (Element) current;
					currentEl.addProcessingInstruction(node.getNodeName(), node
							.getNodeValue());
				} else {
					Document currentDoc = (Document) current;
					currentDoc.addProcessingInstruction(node.getNodeName(),
							node.getNodeValue());
				}

				break;

			case org.w3c.dom.Node.COMMENT_NODE:

				if (current instanceof Element) {
					((Element) current).addComment(node.getNodeValue());
				} else {
					((Document) current).addComment(node.getNodeValue());
				}

				break;

			case org.w3c.dom.Node.DOCUMENT_TYPE_NODE:

				org.w3c.dom.DocumentType domDocType
						= (org.w3c.dom.DocumentType) node;
				document.addDocType(domDocType.getName(), domDocType
						.getPublicId(), domDocType.getSystemId());

				break;

			case org.w3c.dom.Node.TEXT_NODE:
				element.addText(node.getNodeValue());

				break;

			case org.w3c.dom.Node.CDATA_SECTION_NODE:
				element.addCDATA(node.getNodeValue());

				break;

			case org.w3c.dom.Node.ENTITY_REFERENCE_NODE:

				// is there a better way to get the value of an entity?
				org.w3c.dom.Node firstChild = node.getFirstChild();

				if (firstChild != null) {
					element.addEntity(node.getNodeName(), firstChild
							.getNodeValue());
				} else {
					element.addEntity(node.getNodeName(), "");
				}

				break;

			case org.w3c.dom.Node.ENTITY_NODE:
				element.addEntity(node.getNodeName(), node.getNodeValue());

				break;

			default:
				System.out.println("WARNING: Unknown DOM node type: "
						+ node.getNodeType());
		}
	}

	protected static void readElement(org.w3c.dom.Node node, Branch current) {
		int previouslyDeclaredNamespaces = namespaceStack.size();

		String namespaceUri = node.getNamespaceURI();
		String elementPrefix = node.getPrefix();

		if (elementPrefix == null) {
			elementPrefix = "";
		}

		org.w3c.dom.NamedNodeMap attributeList = node.getAttributes();

		if ((attributeList != null) && (namespaceUri == null)) {
			// test if we have an "xmlns" attribute
			org.w3c.dom.Node attribute = attributeList.getNamedItem("xmlns");

			if (attribute != null) {
				namespaceUri = attribute.getNodeValue();
				elementPrefix = "";
			}
		}

		QName qName = namespaceStack.getQName(namespaceUri,
				node.getLocalName(), node.getNodeName());
		Element element = current.addElement(qName);

		if (attributeList != null) {
			int size = attributeList.getLength();
			List attributes = new ArrayList(size);

			for (int i = 0; i < size; i++) {
				org.w3c.dom.Node attribute = attributeList.item(i);

				// Define all namespaces first then process attributes later
				String name = attribute.getNodeName();

				if (name.startsWith("xmlns")) {
					String prefix = getPrefix(name);
					String uri = attribute.getNodeValue();

					Namespace namespace = namespaceStack.addNamespace(prefix,
							uri);
					element.add(namespace);
				} else {
					attributes.add(attribute);
				}
			}

			// now add the attributes, the namespaces should be available
			size = attributes.size();

			for (int i = 0; i < size; i++) {
				org.w3c.dom.Node attribute = (org.w3c.dom.Node) attributes
						.get(i);
				QName attributeQName = namespaceStack.getQName(attribute
						.getNamespaceURI(), attribute.getLocalName(), attribute
						.getNodeName());
				element.addAttribute(attributeQName, attribute.getNodeValue());
			}
		}

		// Recurse on child nodes
		org.w3c.dom.NodeList children = node.getChildNodes();

		for (int i = 0, size = children.getLength(); i < size; i++) {
			org.w3c.dom.Node child = children.item(i);
			readTree(child, element);
		}

		// pop namespaces from the stack
		while (namespaceStack.size() > previouslyDeclaredNamespaces) {
			namespaceStack.pop();
		}
	}

	protected static Namespace getNamespace(String prefix, String uri) {
		return getDocumentFactory().createNamespace(prefix, uri);
	}

	protected static Document createDocument() {
		return getDocumentFactory().createDocument();
	}

	protected static void clearNamespaceStack() {
		namespaceStack.clear();

		if (!namespaceStack.contains(Namespace.XML_NAMESPACE)) {
			namespaceStack.push(Namespace.XML_NAMESPACE);
		}
	}

	static String getPrefix(String xmlnsDecl) {
		int index = xmlnsDecl.indexOf(':', 5);

		if (index != -1) {
			return xmlnsDecl.substring(index + 1);
		} else {
			return "";
		}
	}

	@Override
	public void output() {
		DOMReaderData.getPrefix(null);
		DOMReaderData.setDocumentFactory(factory);
		DOMReaderData.readTree(null, null);
		DOMReaderData.readElement(null, null);
		DOMReaderData.getNamespace(null, null);
		DOMReaderData.createDocument();
		DOMReaderData.clearNamespaceStack();
		DOMReaderData.getPrefix(null);
	}
}
