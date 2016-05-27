package by.training.task3.dom.entity;

public class DOMDocument {
	private DOMNode root;

	public DOMDocument()
	{
		
	}
	public DOMDocument(DOMNode root)
	{
		this.root = root; 
	}
	public DOMNode getDocumentElement() {
		return root;
	}
	@Override
	public String toString() {
		return "DOMDocument [root=" + root + "]";
	}
	
}
