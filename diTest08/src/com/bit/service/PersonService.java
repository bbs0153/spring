package com.bit.service;


public class PersonService {
	
	int age;
	
	public PersonService(int age) {
		super();
		this.age = age;
	}
	
	public void service() {
		System.out.println("������,"+age);
	}

}
