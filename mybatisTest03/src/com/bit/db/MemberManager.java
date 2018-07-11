package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.MemberVO;

public class MemberManager {

	private static SqlSessionFactory factory;

	static {
		try {

			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static List<MemberVO> listAll() {

		List<MemberVO> list = null;
		SqlSession session = factory.openSession(true);
		list = session.selectList("member.selectAll");
		session.close();
		return list;
	}

	public static int insert(MemberVO m) {

		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("member.insert", m);
		session.close();
		return re;

	}

	public static MemberVO getMember(String id) {

		MemberVO m = new MemberVO();

		SqlSession session = factory.openSession();
		Map map = new HashMap();
		map.put("id", id);
		m = session.selectOne("member.getMember", map);
		session.close();
		return m;

	}

	public static int update(MemberVO m) {

		int re = -1;

		SqlSession session = factory.openSession(true);
		re = session.update("member.updatMember", m);
		session.close();
		return re;

	}

	public static int delete(String id) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.delete("member.deleteMember", id);
		session.close();
		return re;

	}

}
