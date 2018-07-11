package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bit.exam01.SpringConfig;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		WriteArticleService writeArticleService = (WriteArticleService)context.getBean("ws");
		writeArticleService.service();

	}

}
