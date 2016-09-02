package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TelefonTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		context.registerShutdownHook();
		
		Telefon telefon=context.getBean("telId",Telefon.class);
		
				
		System.out.println(telefon);
		
		context.registerShutdownHook();

	}

}
