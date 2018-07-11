package com.bit.dao;

import java.util.List;

import com.bit.db.MemberManager;
import com.bit.vo.MemberVO;

public class memberDAO {

	public List<MemberVO> listAll() {
		return MemberManager.listAll();
	}

	public int insert(MemberVO m) {
		return MemberManager.insert(m);
	}

	public MemberVO getMember(String id) {
		return MemberManager.getMember(id);
	}

	public int update(MemberVO m) {
		return MemberManager.update(m);
	}

	public int delete(String id) {
		return MemberManager.delete(id);
	}
}
