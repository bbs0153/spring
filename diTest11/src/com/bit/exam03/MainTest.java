package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/beans.xml");
		WriteArticleService writeArticleService = (WriteArticleService)context.getBean("writeArticleService");
		writeArticleService.service();
	}

}
