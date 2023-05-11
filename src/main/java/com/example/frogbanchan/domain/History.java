package com.example.frogbanchan.domain;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class History implements Serializable {

    /* Private Fields */
    private String username;
    Timestamp recorded_date;
    private int menu_id;
    private int place_id;
    private int score;

    /* JavaBeans Properties */
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getRecorded_date() {
        return recorded_date;
    }

    public int getMenu_id() {
        return menu_id;
    }
    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public int getPlace_id() {
        return place_id;
    }
    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}