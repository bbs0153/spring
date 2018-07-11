package com.bit.exam01;

public class Executor {

	private Worker worker;

	public Executor(Worker worker) {
		super();
		this.worker = worker;
		
		System.out.println("持失切 1");
	}

	public Executor(String worker) {
		
		System.out.println("持失切 2");
	}

}
