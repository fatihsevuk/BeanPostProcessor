package com.fatih;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TelefonBeanPostProcess implements BeanPostProcessor {
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("baþlatma öncesi bean adý: "+beanName);
		
		return bean;
	}
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("baþlatma sonrasý bean adý: "+beanName);
		return bean;
	}
	
	

}
