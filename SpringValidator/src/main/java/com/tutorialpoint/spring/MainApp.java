package com.tutorialpoint.spring;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
//	public static void main(String[] args){
//		
//		//----------Lazy Loading Example--------------
////		ApplicationContext context=new ClassPathXmlApplicationContext("Context.xml");
////		HelloWorld objA= (HelloWorld) context.getBean("helloWorld");
////		
////		objA.setMessage("I am A");
////		objA.getMessage();
////		
////		HelloWorld objB= (HelloWorld) context.getBean("helloWorld");
////		objB.getMessage();
//		
//		//-------Spring Life Cycle-----------
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Context.xml");
//		HelloWorld obj= (HelloWorld) context.getBean("helloWorld");
//		obj.getMessage();
//		context.registerShutdownHook();
//		}
	
	   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
//
//		      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//
//		      objA.getMessage1();
//		      objA.getMessage2();

		      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		      objB.getMessage1();
		      objB.getMessage2();
		      objB.getMessage3();
		   }
}
