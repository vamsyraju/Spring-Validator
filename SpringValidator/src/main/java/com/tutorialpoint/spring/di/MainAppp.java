package com.tutorialpoint.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppp {
	 public static void main(String[] args) {
		 AbstractApplicationContext 	 context = 
            new ClassPathXmlApplicationContext("Context.xml");

	 TextEditor te = (TextEditor) context.getBean("textEditor");

     te.spellCheck();
     context.registerShutdownHook();
}
}