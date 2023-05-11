package com.example.frogbanchan.dao.jdbc;
import com.example.frogbanchan.domain.Team;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamDaoJDBC {

	private JDBCUtil jdbcUtil = null;   
	
	public TeamDaoJDBC() {         
		jdbcUtil = new JDBCUtil();   
	}
	
	//public Team insertTeam(Team team) throws SQLException {}
	
	public Team findTeam(int teamId) throws SQLException {
		String sql = "SELECT * "
					+ "FROM TEAM "
					+ "WHERE TEAM_ID = ?";      
		jdbcUtil.setSqlAndParameters(sql, new Object[] { teamId });
		Team team = new Team();
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();	
			if (rs.next()) {
				team = new Team(
						teamId, 
						rs.getString("name"), 
						rs.getString("creator"),
						rs.getString("address"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();	
		}
		return team;
	}
	
	
	
}