package com.example.frogbanchan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.example.frogbanchan.domain.PlaceMenu;
import com.example.frogbanchan.domain.Place;

public interface PlaceMenuDao {
    //가게 메뉴 생성
    void insertPlaceMenu(PlaceMenu placeMenu) throws DataAccessException;
    //[INSERT INTO PLACE_MENU (PLACE_MENU_ID, PLACE_ID, MENU_ID, NAME, PRICE, DESCRIPTION) VALUES ...]

		//가게 메뉴 수정
    void updatePlaceMenu(PlaceMenu placeMenu) throws DataAccessException;
    //[UPDATE PLACE_MENU SET (NAME, PRICE, DESCRIPTION) VALUES ...
    // WHERE PLACE_MENU_ID = ?]

    //가게 메뉴 삭제
    void deletePlaceMenu(int place_menu_id) throws DataAccessException;
    //[DELETE FROM PLACE_MENU WHERE PLACE_MENU_ID = ?]

    //가게 메뉴 리스트 조회
    List<PlaceMenu> findMenuListByPlaceId(String place_id) throws DataAccessException;
    //[SELECT * FROM PLACE_MENU
    // WHERE PLACE_ID = ?]

    //메뉴로 가게 조회
    List<Place> findPlaceListByMenu(int menu_id) throws DataAccessException;
    //[SELECT * FROM PLACE
    // WHERE PLACE_ID IN (
    //      SELECT PLACE_ID FROM PLACE_MENU
    //      WHERE MENU_ID = ?) ]
}