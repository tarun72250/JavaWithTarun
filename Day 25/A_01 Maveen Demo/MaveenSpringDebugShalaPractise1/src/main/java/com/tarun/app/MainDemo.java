package com.tarun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarun.beans.Student;

public class MainDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tarun/resources/ApplicationContext.xml");
		
				Student s = (Student)context.getBean(Student.class);
				System.out.println(s);
	}
}
