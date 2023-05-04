package com.example.frogbanchan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.domain.Team;

public interface TeamDao {
    //팀 조회
    Team findTeam(int team_id) throws DataAccessException; 
    //[SELECT TEAM_ID, NAME, ADDRESS, CREATOR FROM TEAM WHERE TEAM_ID = ?]

    //팀 리스트 조회
    List<Team> findTeamList(String username) throws DataAccessException;
		//팀 리스트 조회하려면 연관 개체 PARTICIPATION 이용, 정보 조회 시 조인 필요
    //[SELECT TEAM_ID, NAME, ADDRESS, CREATOR FROM MEMBER 
		//                      JOIN PARTICIPATION ON MEMBER.USERNAME = PARTICIPATION.USERNAME
		//                      JOIN TEAM ON TEAM.TEAM_ID = PARTICIPATION.TEAM_ID
    //                      WHERE MEMBER.USERNAME = ?] 뭔가 거시기한데..

    //팀원 리스트 조회
    List<Member> findTeamMembers(int team_id) throws DataAccessException;
		//팀원 리스트 조회하려면 연관 개체 PARTICIPATION 이용, 정보 조회 시 조인 필요
    //[SELECT USERNAME, NAME, NICKNAME FROM TEAM
		//                      JOIN TEAM ON TEAM.TEAM_ID = PARTICIPATION.TEAM_ID
		//                      JOIN PARTICIPATION ON MEMBER.USERNAME = PARTICIPATION.USERNAME
    //                      WHERE TEAM.TEAM_ID = ?] 이것도 거시기...

    //팀 생성
    void insertTeam(Team team) throws DataAccessException;
    //[INSERT INTO TEAM (TEAM_ID, NAME, ADDRESS, CREATOR) VALUES ..]

    //팀 정보 수정
    void updateTeam(Team team) throws DataAccessException;
    //[UPDATE TEAM SET NAME = ?, ADDRESS = ? WHERE TEAM_ID = ?] 팀 이름, 주소 변경

    //팀원 추가(팀장 권한)
    void addTeamMember(int team_id, String username) throws DataAccessException;
    //[INSERT INTO PARTICIPATION (TEAM_ID, USERNAME) VALUES ..]

    //팀원 삭제(팀장 권한)
    void deleteTeamMember(int team_id, String username) throws DataAccessException;
    //[DELETE FROM PARTICIPATION WHERE TEAM_ID = ? AND USERNAME = ?]

    //팀 삭제(팀장 권한)
    void deleteTeam(int team_id);
    //[DELETE FROM TEAM WHERE TEAM_ID = ?]

    //팀 나가기(멤버 권한)
    void quitTeam(int team_id) throws DataAccessException; 
		//[DELETE FROM PARTICIPATION WHERE TEAM_ID = ?]
}