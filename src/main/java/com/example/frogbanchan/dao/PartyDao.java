package com.example.frogbanchan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.frogbanchan.domain.Party;

public interface PartyDao {
    // 식구 모집 리스트 조회
    List<Party> findPartyList() throws DataAccessException; 
    //[SELECT PARTY_ID, CREATOR, MEET_DATE, PLACE_ID FROM PARTY]

    //식구 모집 조회
    Party findParty(int party_id) throws DataAccessException;
    //[SELECT PARTY_ID, CREATOR, MEET_DATE, PLACE_ID, CONTENT FROM PARTY WHERE PARTY_ID = ?]
   
    //식구 모집 등록
    void insertParty(Party party) throws DataAccessException;
    //[INSERT INTO PARTY (PARTY_ID, CREATOR, MEET_DATE, PLACE_ID, CONTENT) VALUES ...]

    //식구 모집 삭제
    void deleteParty(int party_id) throws DataAccessException;
    //[DELETE FROM PARTY WHERE PARTY_ID = ?]
    
}