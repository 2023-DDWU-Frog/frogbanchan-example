package com.example.frogbanchan.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.frogbanchan.domain.Member;

public class MemberDaoJDBC {

	private JDBCUtil jdbcUtil = null;    // JDBCUtil 객체를 참조하기 위한 변수
	
	public MemberDaoJDBC() {   // 생성자        
		jdbcUtil = new JDBCUtil();      // JDBCUtil 객체 생성
	}
	
	public Member findMemberByNickname(String nickname) throws SQLException {
		String sql = "SELECT * "
					+ "FROM MEMBER "
					+ "WHERE NICKNAME = ?";      
		jdbcUtil.setSqlAndParameters(sql, new Object[] { nickname });	// JDBCUtil에 query문과 매개 변수 설정

		Member member = new Member();
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();		// query 실행
			if (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String residentNo = rs.getString("resident_no");
				String address = rs.getString("address");
				member = new Member(username, password, name, nickname, phone, email, residentNo, address);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();		// resource 반환
		}
		return member;
	}

	public List<String> findUsernameList() throws SQLException {
		String sql = "SELECT username FROM MEMBER";      
		jdbcUtil.setSqlAndParameters(sql, new Object[] {});	// JDBCUtil에 query문과 매개 변수 설정

		List<String> memberList = new ArrayList<String>();
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();		// query 실행
			while (rs.next()) {
				String username = rs.getString("username");
				memberList.add(username);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();		// resource 반환
		}
		return memberList;
	}
	
}
