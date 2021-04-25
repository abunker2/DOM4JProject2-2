package org.dom4j.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public interface DOMAttributeInterface {
	public void DomAttributeNodeMapClass(DOMElement element);
	public Node getNamedItem(String name);
	public Node setNamedItem(Node arg) throws DOMException;
	public Node removeNamedItem(String name) throws DOMException;
	public Node item(int index);
	public int getLength();
	public Node getNamedItemNS(String namespaceURI, String localName);
	public Node setNamedItemNS(Node arg) throws DOMException;
	public Node removeNamedItemNS(String namespaceURI, String localName)
			throws DOMException;
}
