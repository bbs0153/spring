package com.bit.service;

import com.bit.dao.MemberDao;

public class MemberService {

	private MemberDao dao;

	public MemberService(MemberDao dao) {
		super();
		this.dao = dao;
	}

	public void service() {
		System.out.println("서비스 입니다.");
		dao.insert();
	}
}
