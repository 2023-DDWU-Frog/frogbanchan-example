package com.example.frogbanchan.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

    public int insertPlace(Place place) throws SQLException {
        String sql = "INSERT INTO PLACE(PLACE_ID, PASSWORD, NAME, ADDRESS) VALUES (?, ?, ?, ?) ";
        jdbcUtil.setSqlAndParameters(sql,
                new Object[] { place.getPlaceId(), place.getPassword(), place.getName(), place.getAddress() });

        try {
            int rslt = jdbcUtil.executeUpdate(); // query 실행
            return rslt;
        } catch (Exception ex) {
            jdbcUtil.rollback();
            ex.printStackTrace();
        } finally {
            jdbcUtil.commit();
            jdbcUtil.close();
        }
        return 0;
    }

    public int updatePlace(Place place) throws SQLException {
        String sql = "UPDATE PLACE " +
                "SET PASSWORD = ?, NAME = ?, ADDRESS = ? " +
                "WHERE PLACE_ID = ?";
        jdbcUtil.setSqlAndParameters(sql,
                new Object[] { place.getPassword(), place.getName(), place.getAddress(), place.getPlaceId() });

        try {
            int rslt = jdbcUtil.executeUpdate(); // query 실행
            return rslt;
        } catch (Exception ex) {
            jdbcUtil.rollback();
            ex.printStackTrace();
        } finally {
            jdbcUtil.commit();
            jdbcUtil.close();
        }
        return 0;
    }

    public int deletePlace(String placeId) throws SQLException {
        String sql = "DELETE FROM PLACE WHERE PLACE_ID = ?";
        jdbcUtil.setSqlAndParameters(sql,
                new Object[] { placeId });

        try {
            int rslt = jdbcUtil.executeUpdate(); // query 실행
            return rslt;
        } catch (Exception ex) {
            jdbcUtil.rollback();
            ex.printStackTrace();
        } finally {
            jdbcUtil.commit();
            jdbcUtil.close();
        }
        return 0;
    }

    public int insertAvailableTime(String placeId, List<Timestamp> availableTime) throws SQLException {
        String sql = "INSERT INTO PLACE_AVAILABLE(PLACE_ID, AVAILABLE_TIME) VALUES (?, ?) ";

        for (Timestamp timestamp : availableTime) {
            jdbcUtil.setSqlAndParameters(sql, new Object[] { placeId, timestamp });

            try {
                int rslt = jdbcUtil.executeUpdate(); // query 실행
                return rslt;
            } catch (Exception ex) {
                jdbcUtil.rollback();
                ex.printStackTrace();
            } finally {
                jdbcUtil.commit();
                jdbcUtil.close();
            }
        }
        return 0;
    }

    public List<Timestamp> findCalendar(String placeId) throws SQLException {
        String sql = "SELECT * FROM PLACE_AVAILABLE WHERE PLACE_ID = ? ";
        jdbcUtil.setSqlAndParameters(sql, new Object[] { placeId }); // JDBCUtil에 query문과 매개 변수 설정

        List<Timestamp> available_time = new ArrayList<Timestamp>();
        try {
            ResultSet rs = jdbcUtil.executeQuery(); // query 실행
            if (rs.next()) {
                Timestamp time = rs.getTimestamp("AVAILABLE_TIME");
                available_time.add(time);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            jdbcUtil.close(); // resource 반환
        }
        return available_time;
    }

}
