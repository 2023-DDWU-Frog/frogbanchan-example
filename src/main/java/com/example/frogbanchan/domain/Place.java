package com.example.frogbanchan.domain;

import java.security.Timestamp;
import java.util.List;

public class Place {
    private String placeId;
    private String password;
    private String name;
    private String address;
    private double totalScore;
    private List<PlaceMenu> menuList;
    private List<Timestamp> availableTime;
    private List<Reservation> reservationList;

    public Place() {
    }

    public Place(String placeId, String name, String address) {
        this.placeId = placeId;
        this.name = name;
        this.address = address;
    }

    public Place(String placeId, String password, String name, String address, double totalScore,
            List<PlaceMenu> menuList, List<Timestamp> availableTime, List<Reservation> reservationList) {
        this.placeId = placeId;
        this.password = password;
        this.name = name;
        this.address = address;
        this.totalScore = totalScore;
        this.menuList = menuList;
        this.availableTime = availableTime;
        this.reservationList = reservationList;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public List<PlaceMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<PlaceMenu> menuList) {
        this.menuList = menuList;
    }

    public List<Timestamp> getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(List<Timestamp> availableTime) {
        this.availableTime = availableTime;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

}
