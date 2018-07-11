package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

		Person p = (Person) context.getBean("p");
		p.eat("»ï°ã»ì");

		MemberDao member = (MemberDao) context.getBean("member");
		member.insert();

		BoardDao board = (BoardDao) context.getBean("board");
		board.insert();

	}
}
