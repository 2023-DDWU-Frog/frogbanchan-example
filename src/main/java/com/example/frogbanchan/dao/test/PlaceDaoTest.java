package com.example.frogbanchan.dao.test;

import java.sql.SQLException;

import com.example.frogbanchan.dao.jdbc.PlaceDaoJDBC;
import com.example.frogbanchan.domain.Place;

public class PlaceDaoTest {
    public static void main(String[] args) {
        PlaceDaoJDBC placeDao = new PlaceDaoJDBC();

        System.out.println("test start...");
        // findPlace 테스트
        String placeId; // ID삽입
        try {
            Place place = placeDao.findPlaceById("ADMIN1");
            System.out.print(place.getName() + "," + place.getAddress());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
