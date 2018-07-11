package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.DeptVO;

public class DeptManager {

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

	public static List<DeptVO> listAll() {

		List<DeptVO> list = null;

		SqlSession session = factory.openSession();
		list = session.selectList("dept.selectAll");
		session.close();

		return list;

	}

	public static int insert(DeptVO d) {
		int re = -1;

		// SqlSession session = factory.openSession();
		SqlSession session = factory.openSession(true); // ÀÚµ¿ commit
		re = session.insert("dept.insert", d);
		// session.commit();
		session.close();
		return re;
	}

	public static DeptVO getDept(int dno) {

		DeptVO d = new DeptVO();

		SqlSession session = factory.openSession();
		Map map = new HashMap();
		map.put("dno", dno);
		d = session.selectOne("dept.getDept", map);
		session.close();

		return d;
	}

	public static int update(DeptVO d) {

		int re = -1;

		SqlSession session = factory.openSession(true);
		re = session.update("dept.updateDept", d);
		session.close();
		return re;

	}

	public static int delete(int dno) {
		int re = -1;

		SqlSession session = factory.openSession(true);
		re = session.delete("dept.deleteDept", dno);
		session.close();
		return re;
	}
}
