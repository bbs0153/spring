package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.service.MemberService;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans.xml");
		MemberService ms = (MemberService)context.getBean("ms");
		
		ms.service();

		
	}

}
