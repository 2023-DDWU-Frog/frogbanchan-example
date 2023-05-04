package com.example.frogbanchan.dao.test;

import java.sql.SQLException;
import java.util.List;

import com.example.frogbanchan.dao.jdbc.MemberDaoJDBC;

public class MemberDaoTest {
	public static void main(String[] args) {
		MemberDaoJDBC memberDao = new MemberDaoJDBC();
		
		// insert 테스트
//		memberDao.insertMember(new Member());
		System.out.println("test start...");
		// findMember 테스트
		try {
			List<String> list = memberDao.findUsernameList();
			for (String s : list) {
				System.out.print(s + " ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
	}
}
