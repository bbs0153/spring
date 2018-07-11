package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.vo.Person;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans.xml"); // 생성자 동작
	 System.out.println("2");
	  Person p = (Person)context.getBean("p");
	  System.out.println("3");
	  p.eat("곱창");
	  System.out.println("4");
	
	}

}