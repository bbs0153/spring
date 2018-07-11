package com.bit.exam09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam09/beans09.xml");
		SystemMonitor monitor = (SystemMonitor)context.getBean("systemMonitor");
		
		monitor.monitor();
	}
}