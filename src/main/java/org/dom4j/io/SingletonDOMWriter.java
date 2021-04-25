package org.dom4j.io;

import org.dom4j.DocumentException;

public class SingletonDOMWriter {
	public static void main(String[] args) throws DocumentException {
		DOMWriter.getDomDocumentClass();
		DOMWriter.setDomDocumentClass(null);
		DOMWriter.setDomDocumentClassName(null);
		DOMWriter.attributeNameForNamespace(null);
		DOMWriter.resetNamespaceStack();
	}
}
