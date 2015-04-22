package com.spring.lazyload;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInit {
	 public static void main(String args[]) {
			        //Initializing context
			        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( new String[]{"Context.xml"});
			        System.out.println("After initialization");
		 	        applicationContext.getBean("addressBean");
			    }
}
