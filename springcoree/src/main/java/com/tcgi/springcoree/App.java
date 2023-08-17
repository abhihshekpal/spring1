package com.tcgi.springcoree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class App {
	@Autowired
	Student st;
	@Autowired
	Course cs;
	@Autowired
	Professor p;
	public static void main(String args[]) 
	{
	

		System.out.println("*BY JAVA ANNOTATION METHOD");
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();
		ctx1.scan("com.tcgi");
		ctx1.refresh();
		App ap = ctx1.getBean(App.class);
		System.out.println("Student Name : "+ap.st.getStudName());
		System.out.println("Student Roll : "+ap.st.getStudRoll());
		
		
		System.out.println("Course : "+ap.cs.getCourseId());
		System.out.println("Course Id : "+ap.cs.getCourseName());
		

		System.out.println("Professor Name : "+ap.p.getProfName());	
	}
}
