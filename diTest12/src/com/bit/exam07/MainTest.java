package com.bit.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		SystemMonitor monitor = (SystemMonitor)context.getBean("sm");
		monitor.monitor();

	}

}
