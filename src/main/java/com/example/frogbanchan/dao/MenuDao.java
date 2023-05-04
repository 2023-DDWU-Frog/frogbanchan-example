package com.example.frogbanchan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.example.frogbanchan.domain.Menu;

public interface MenuDao {
    //메뉴 조회
    Menu findMenu(int menu_id) throws DataAccessException;
    //[SELECT * FROM MENU WHERE MENU_ID = ?]

    //메뉴 리스트 조회
    List<Menu> findMenuList() throws DataAccessException;
    //[SELECT * FROM MENU]

    //태그 리스트로 메뉴 리스트 조회
    List<Menu> findMenuListByTagList(List<String> likeTagList, List<String> dislikeTagList) throws DataAccessException;
    //[SELECT *
    // FROM MENU JOIN MENU_TAG ON MENU.MENU_ID = MENU_TAG.MENU_ID
    // WHERE MENU_TAG.TAG IN ? AND MENU_TAG.TAG NOT IN ?]

    //매뉴의 태그 리스트 조회
    List<String> findMenuTags(int menu_id) throws DataAccessException;
    //[SELECT TAG
    // FROM MENU_TAG
    // WHERE MENU_ID = ?]

    //모든 태그 리스트 조회
    List<String> findAllTag() throws DataAccessException;
    //[SELECT DISTINCT TAG FROM MENU_TAG ]
}