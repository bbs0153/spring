package com.bit.exam06;

public class Person {

	private String name;
	private int age;

	

	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void eat(String food) {
		System.out.println(age + "살 " + name + "이(가) " + food + "를(을 ) 먹어요");
	}

}
