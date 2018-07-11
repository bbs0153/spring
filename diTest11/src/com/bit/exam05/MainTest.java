package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam05/beans.xml");
		SystemMonitor monitor = (SystemMonitor)context.getBean("systemMonitor");
		
		monitor.monitor();
	}
}