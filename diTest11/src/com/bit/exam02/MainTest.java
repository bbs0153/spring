package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam02/beans.xml");
		JobExecutor jobExecutor = (JobExecutor)context.getBean("jobExecutor");

	}
}
