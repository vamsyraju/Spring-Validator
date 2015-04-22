package com.tutorialpoint.spring.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventMainApp {
	public static void main(String[] args){
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
		applicationContext.start();
		applicationContext.stop();
	}
}
