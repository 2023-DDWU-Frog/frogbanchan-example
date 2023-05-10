package com.example.frogbanchan.dao.test;

import java.sql.SQLException;
import java.util.List;

import com.example.frogbanchan.dao.jdbc.MemberDaoJDBC;
import com.example.frogbanchan.domain.Member;

public class MemberDaoTest {
	public static void main(String[] args) throws SQLException {
		MemberDaoJDBC memberDao = new MemberDaoJDBC();
		
		System.out.println("test start...");
		
		// findMemberByNickname test
		System.out.println("\nfindMemberByNickname");
		Member member = memberDao.findMemberByNickname("나메코");
		System.out.println(member);
		
		// findUsernameList test
		System.out.println("\nfindUsernameList");
		List<String> list = memberDao.findUsernameList();
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println();
	}
}
