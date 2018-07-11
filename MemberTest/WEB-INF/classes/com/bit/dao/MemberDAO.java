package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.MemberVO;

public class MemberDAO {

	public ArrayList<MemberVO> listAll() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		String sql = "select * from member";

		try {

			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				list.add(new MemberVO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}

			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return list;

	}

}
