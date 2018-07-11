package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.DeptVO;

public class DeptDAO {

	public ArrayList<DeptVO> listAll(){
		
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		String sql = "select * from dept";
		try {
			
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				list.add(new DeptVO(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			
			ConnectionProvider.close(rs, stmt, conn);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return list;
	}

}
