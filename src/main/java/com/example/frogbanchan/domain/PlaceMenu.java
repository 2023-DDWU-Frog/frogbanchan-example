package com.example.frogbanchan.domain;
import java.io.Serializable;

@SuppressWarnings("serial")
public class PlaceMenu extends Menu implements Serializable {

    /* Private Fields */
    private int place_menu_id;
    private String place_id;
    private int menu_id;
    private String name;
    private int price;
    private String description;

    /* JavaBeans Properties */
    public int getPlace_menu_id() {
        return place_menu_id;
    }
    public void setPlace_menu_id(int place_menu_id) {
        this.place_menu_id = place_menu_id;
    }

    public String getPlace_id() {
        return place_id;
    }
    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public int getMenu_id() {
        return menu_id;
    }
//    public void setMenu_id(int menu_id) {
//        this.menu_id = super.menu_id;
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /* Public Methods */
    public String toString() {
        return getName();
    }
}