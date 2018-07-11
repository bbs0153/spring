package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.service.WriteAticleService;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans.xml");
		WriteAticleService ws = (WriteAticleService)context.getBean("ws");
		
		ws.service();

	}

}
