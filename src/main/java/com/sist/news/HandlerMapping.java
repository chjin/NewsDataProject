package com.sist.news;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//��û URL�� ���εǴ� Controller �˻�.
public class HandlerMapping extends DefaultHandler{

	List<String> list=new ArrayList<>();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		try{
			if(qName.equals("context:component-scan")){
				String pack=attributes.getValue("base-package");
				list.add(pack);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	
}






























