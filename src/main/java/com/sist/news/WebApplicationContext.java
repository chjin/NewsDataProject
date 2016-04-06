package com.sist.news;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class WebApplicationContext {
	
	//IoC 컨테이너 역할 수행
	private List<String> list=new ArrayList<>();
	
	public WebApplicationContext(String path){
		
		try{
			SAXParserFactory spf=SAXParserFactory.newInstance();
			SAXParser sp=spf.newSAXParser();
			
			HandlerMapping handlerMapping=new HandlerMapping();
			sp.parse(new File(path), handlerMapping);
			
			list=handlerMapping.list;
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public List<String> getFileName(){
		List<String> packList=new ArrayList<>();
		
		for(String pack:list){
			List<String> fileList=FileConfig.getFileData(pack);
			for(String str:fileList){
				packList.add(str);
			}
		}
		return packList;
	}
}













































