package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVO;

public class BoardDAO {

	public ArrayList<BoardVO> listAll() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "select * from board";

		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				list.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
						rs.getInt(11), rs.getInt(12), rs.getInt(13)));

			}

			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return list;

	}

	public BoardVO getBoard(int no) {

		String sql = "SELECT * FROM board WHERE no=?";
		BoardVO b = null;
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				b = new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
						rs.getInt(11), rs.getInt(12), rs.getInt(13));
			}

			ConnectionProvider.close(rs, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return b;
	}

	public int getNextNo() {

		int no = 0;
		String sql = "SELECT nvl(max(no),0)+1 FROM board";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				no = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return no;
	}

	public void updateStep(int b_ref, int b_step) {

		String sql = "UPDATE board SET b_step=b_step+1 WHERE b_ref=? AND b_step>?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_ref);
			pstmt.setInt(2, b_step);
			pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public int insertBoard(BoardVO b) {
		int re = -1;

		try {

			int no = getNextNo();
			int b_ref = no;
			int b_level = 0;
			int b_step = 0;

			if (b.getNo() != 0) {
				b_ref = getBoard(b.getNo()).getB_ref();
				b_level = getBoard(b.getNo()).getB_level();
				b_step = getBoard(b.getNo()).getB_step();
				updateStep(b_ref, b_step);
				b_level++;
				b_step++;
			}

			String sql = "INSERT INTO board VALUES(?,?,?,?,sysdate,0,?,?,?,?,?,?,?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			pstmt.setString(6, b.getFname());
			pstmt.setString(7, b.getFsize());
			pstmt.setString(8, b.getIp());
			pstmt.setInt(9, b_ref);
			pstmt.setInt(10, b_level);
			pstmt.setInt(11, b_step);

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	public int updateBoard(BoardVO b) {

		int re = -1;
		String sql = "UPDATE board SET title=?,writer=?,content=?,fname=?,fsize=?,ip=? WHERE no=? AND pwd=?";

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getWriter());
			pstmt.setString(3, b.getContent());
			pstmt.setString(4, b.getFname());
			pstmt.setString(5, b.getFsize());
			pstmt.setString(6, b.getIp());
			pstmt.setInt(7, b.getNo());
			pstmt.setString(8, b.getPwd());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}


}
