package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class); 
		Person p1  = (Person)context.getBean("p");
		Person p2  = (Person)context.getBean("p");
		Person p3  = (Person)context.getBean("p");
		
		p1.eat("곱창");
		p2.eat("삼겹살");
		p3.eat("아이스크림");
		
		if(p1==p2) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
		p3.setAge(46);
		
		p1.eat("참이슬");

	}

}
