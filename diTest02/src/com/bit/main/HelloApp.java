package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.BoardDao;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans1.xml");
		BoardDao dao = (BoardDao) context.getBean("dao");
		dao.insert();
	}

}
