package com.sist.news;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 2.
public class DispatcherServlet extends HttpServlet {
	
	private List<String> clazzList=new ArrayList<>();
	
	//3. 스프링 컨테이너 생성
	private WebApplicationContext webApplicationContext;

	@Override
	public void init(ServletConfig config) throws ServletException {
		//4. 
		String path=config.getInitParameter("contextConfigLocation");
		webApplicationContext=new WebApplicationContext(path);
		
		clazzList=webApplicationContext.getFileName();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String cmd=request.getRequestURI();
			
			cmd=cmd.substring(request.getContextPath().length()+1);
			for(String strClazz:clazzList){
				Class clazzName=Class.forName(strClazz);
				//if(clazzName.isAnnotationPresent())
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	
}



























































