package com.bit.exam08;

public class SystemMonitor {
	private int periodTime;
	private SmsSender sender;

	public void setPeroidTime(int peroidTime) {
		this.periodTime = peroidTime;
	}

	public void setSender(SmsSender sender) {
		this.sender = sender;
	}

	public void monitor() {

		System.out.println(periodTime + "분 간격으로");
		sender.send();
	}

}
