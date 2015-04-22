package com.tutorialpoint.spring.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAspect {
	  public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Aspect.xml");

	      Student student = (Student) context.getBean("student");

	      student.getName();
	      student.getAge();
	      
	      student.printThrowException();
	   }
}
