package com.bit.exam02;

public class UpdateInfo {

	private String memberId;

	

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	public void update() {
		System.out.println(memberId+"수정했습니다");
	}

}
