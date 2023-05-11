package com.example.frogbanchan.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.frogbanchan.domain.Place;

public class PlaceDaoJDBC {

    private JDBCUtil jdbcUtil = null; // JDBCUtil 객체를 참조하기 위한 변수

    public PlaceDaoJDBC() { // 생성자
        jdbcUtil = new JDBCUtil(); // JDBCUtil 객체 생성
    }

    public Place findPlaceById(String pid) throws SQLException {
        String sql = "SELECT * FROM PLACE WHERE PLACE_ID = ? ";
        jdbcUtil.setSqlAndParameters(sql, new Object[] { pid }); // JDBCUtil에 query문과 매개 변수 설정

        Place place = new Place();

        try {
            ResultSet rs = jdbcUtil.executeQuery(); // query 실행
            if (rs.next()) {
                String placeId = rs.getString("PLACE_ID");
                String name = rs.getString("NAME");
                String address = rs.getString("ADDRESS");
                place = new Place(placeId, name, address);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            jdbcUtil.close(); // resource 반환
        }
        return place;
    }

    public void insertPlace(Place place) throws SQLException {
        String sql = "INSERT INTO PLACE VALUES";
        jdbcUtil.setSqlAndParameters(sql, new Object[] { place.getPlaceId() }); // JDBCUtil에 query문과 매개 변수 설정

        try {
            ResultSet rs = jdbcUtil.executeQuery(); // query 실행
            if (rs.next()) {
                String placeId = rs.getString("PLACE_ID");
                String name = rs.getString("NAME");
                String address = rs.getString("ADDRESS");
                place = new Place(placeId, name, address);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            jdbcUtil.close(); // resource 반환
        }

    }

}
