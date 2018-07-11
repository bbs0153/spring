package com.bit.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam04/beans.xml");
		Person p1  = (Person)context.getBean("p");
		Person p2  = (Person)context.getBean("p");
		Person p3  = (Person)context.getBean("p");
		
		p1.eat("��â");
		p2.eat("����");
		p3.eat("���̽�ũ��");
		
		if(p1==p2) {
			System.out.println("���ƿ�");
		}else {
			System.out.println("�޶��");
		}
		
		p3.setAge(46);
		
		p1.eat("���̽�");

	}

}
