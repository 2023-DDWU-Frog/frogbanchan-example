package com.example.frogbanchan.dao.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.example.frogbanchan.dao.jdbc.PlaceDaoJDBC;
import com.example.frogbanchan.domain.Place;

public class PlaceDaoTest {
    public static void main(String[] args) {
        PlaceDaoJDBC placeDao = new PlaceDaoJDBC();

        System.out.println("test start...");
        // findPlace 테스트

        Place testinsert = new Place("test1_id", "test1_pw", "test1_name", "test1_ads");
        Place testUpdate = new Place("spring123", "test1_pw", "test1_name", "test1_ads");

        // available_time 가능시간 add test
        List<Timestamp> available_time = new ArrayList<Timestamp>();
        Timestamp timestamp = Timestamp.valueOf("2023-05-14 10:10:00");
        Timestamp timestamp2 = Timestamp.valueOf("2023-05-14 11:10:00");
        available_time.add(timestamp);
        available_time.add(timestamp2);
        try {
            Place place = placeDao.findPlaceById("toritori");
            System.out.println(place.getName() + "," + place.getAddress() + "\n");

            int rslt_1 = placeDao.insertPlace(testinsert);
            System.out.println(rslt_1 + " insertTest");

            int rslt_2 = placeDao.updatePlace(testUpdate);
            System.out.println(rslt_2 + " updateTest");

            int rslt_3 = placeDao.deletePlace("test1_id");
            System.out.println(rslt_3 + "delete Test");

            int rslt_4 = placeDao.insertAvailableTime("test1_id", available_time);
            System.out.println(rslt_4 + " insertAvailableTime Test");

            List<Timestamp> rslt_5 = placeDao.findCalendar("test1_id");
            System.out.println(rslt_5 + " findCalendar Test");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
