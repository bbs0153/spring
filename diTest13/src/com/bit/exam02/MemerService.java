package com.bit.exam02;

public class MemerService {

	private UpdateInfo info;

	

	public void setInfo(UpdateInfo info) {
		this.info = info;
	}

	public void service() {

		System.out.println("MemberService�� service�Դϴ�.");
		info.update();
	}

}
