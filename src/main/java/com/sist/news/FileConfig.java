package com.sist.news;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileConfig {
	public static List<String> getFileData(String pack){
		List<String> list=new ArrayList<>();
		
		try{
			String path="C:\\Users\\cjw\\Documents\\GitStudy\\spring-tool-suite-3.7.3.RELEASE-e4.5.2-win32-x86_64\\workspace\\NewsDataProject\\src\\main\\java";
			path=path+pack.replace('.', '\\');
			
			File dir=new File(path);
			
			File[] files=dir.listFiles();
			for(File file:files){
				if(file.isFile()){
					String name=file.getName();
					String ext=name.substring(name.lastIndexOf('.')+1);
					
					if(ext.equals("java")){
						String object=pack+"."+name.substring(0, name.lastIndexOf('.'));
						//com.sist.model.NewsController
						
						list.add(object);
					}
				}
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		return list;
	}
}





































