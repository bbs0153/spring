package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.GoodsVO;
import com.sun.org.apache.regexp.internal.recompile;

public class GoodsDAO {

	public ArrayList<GoodsVO> listAll() {

		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		String sql = "select * from goods";

		try {

			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				list.add(new GoodsVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));

			}

			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return list;
	}

	public GoodsVO getGoods(int no) {
		GoodsVO g = null;
		String sql = "select * from goods where no=?";

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				g = new GoodsVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
			}

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return g;
	}

	public int insertGoods(GoodsVO g) {

		int re = -1;
		String sql = "insert into goods values(?,?,?,?,?)";

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, g.getNo());
			pstmt.setString(2, g.getItem());
			pstmt.setInt(3, g.getPrice());
			pstmt.setInt(4, g.getQty());
			pstmt.setString(5, g.getFname());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;

	}

	public int updateGoods(GoodsVO g) {
		int re = -1;
		String sql = "update goods set item=?,price=?,qty=?,fname=? where no=?";
		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getItem());
			pstmt.setInt(2, g.getPrice());
			pstmt.setInt(3, g.getQty());
			pstmt.setString(4, g.getFname());
			pstmt.setInt(5, g.getNo());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return re;
	}

	public int deleteGoods(int no) {
		int re = -1;
		String sql = "delete from goods where no=?";
		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return re;

	}

}
