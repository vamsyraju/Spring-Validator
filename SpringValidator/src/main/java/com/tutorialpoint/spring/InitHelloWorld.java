package com.tutorialpoint.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
//		System.out.println("-->postProcessAfterInitialization<-- After Initilization of bean " +beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
//		System.out.println("-->postProcessBeforeInitialization<-- Before Initilization of bean " +beanName);
		return bean;
	}

}
