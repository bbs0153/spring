package com.bit.vo;

public class Person {
	
	int age;
	String name;
	
	// 기본생성자가 있어야한다 기본생성자가 없으면 오류
	public Person() {
		System.out.println("생성자가 호출됨");
	}
	
	public Person(String name) {
		
	}

	public void study() {
		System.out.println("공부합니다.");
	}
}

