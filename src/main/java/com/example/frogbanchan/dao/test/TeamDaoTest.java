package com.example.frogbanchan.dao.test;

import java.sql.SQLException;
import com.example.frogbanchan.dao.jdbc.TeamDaoJDBC;
import com.example.frogbanchan.domain.Team;

public class TeamDaoTest {
	public static void main(String[] args) throws SQLException {
		TeamDaoJDBC teamDao = new TeamDaoJDBC();
		
		System.out.println("test start...");
		
		// findTeam test
		System.out.println("\nfindTeam");
		Team team = teamDao.findTeam(101);
		System.out.println(team.getTeamId());
		System.out.println(team.getName());
		System.out.println(team.getCreator());
		System.out.println(team.getAddress());
	
		System.out.println();
	}
}