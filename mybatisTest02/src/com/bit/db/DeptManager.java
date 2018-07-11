package com.bit.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.DeptVO;

public class DeptManager {

	private static SqlSessionFactory factory;

	static {
		
		try {

			Reader reader = Resources.getResourceAsReader("com/bit/db/mybatisConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public List<DeptVO> listAll() {

		List<DeptVO> list = null;
		SqlSession session = factory.openSession();
		list = session.selectList("dept.selectAll");
		session.close();
		return list;
	}

	public int insert(DeptVO d) {

		int re = -1;

		SqlSession session = factory.openSession(true);
		re = session.insert("dept.insert", d);
		return re;
	}
}
