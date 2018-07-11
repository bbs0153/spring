package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new AnnotationConfigApplicationContext(MemberConfig.class);
		MemerService member = (MemerService)context.getBean("member");
		
		//member.service();
	}

}
