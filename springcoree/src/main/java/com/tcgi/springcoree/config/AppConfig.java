package com.tcgi.springcoree.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcgi.springcoree.*;
import com.tcgi.springcoree.*;
import com.tcgi.springcoree.*;

@Configuration
public class AppConfig{
	@Bean
	public Student getStudent()
	{
		Student st = new Student();
		st.setStudName("Pal");
		st.setStudRoll(29);
		return st;
	}
	@Bean
	public Course getCourse()
	{
		Course cs = new Course();
		cs.setCourseName("Computer Science");
		cs.setCourseId(1506);
		return cs;
	}
	@Bean
	public Professor getProfessor()
	{
		Professor p = new Professor();
		p.setProfName("bhagwant");
		return p;
	}
}

