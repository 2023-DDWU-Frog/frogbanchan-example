package com.example.frogbanchan.dao.test;

import java.sql.SQLException;

import com.example.frogbanchan.dao.jdbc.PlaceDaoJDBC;
import com.example.frogbanchan.domain.Place;

public class PlaceDaoTest {
    public static void main(String[] args) {
        PlaceDaoJDBC placeDao = new PlaceDaoJDBC();

        System.out.println("test start...");
        // findPlace 테스트
        try {
            Place place = placeDao.findPlaceById();
            System.out.print(place);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
