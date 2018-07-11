package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.vo.Person;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans.xml"); // 생성자 동작
		Person p1 = (Person) context.getBean("p");
		Person p2 = (Person) context.getBean("p");
		
		if(p1==p2) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}

	}
}