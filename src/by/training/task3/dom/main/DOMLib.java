package by.training.task3.dom.main;

import by.training.task3.dom.entity.DOMDocument;
import by.training.task3.dom.entity.DOMNode;
import by.training.task3.dom.service.DOMParser;

public class DOMLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMParser p=new DOMParser();

        DOMDocument d = p.parse("resources/menu.xml");

        DOMNode d1 = d.getDocumentElement();
        
        System.out.println(d1.toString());
	}

}
