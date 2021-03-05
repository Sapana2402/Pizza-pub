package com.example.pizzapub;

public class BurgerData {

    private String burger_name,burger_prize,burger_description;
    private int burger_imageId;

    public BurgerData() {
    }

    public BurgerData(String burger_name, String burger_prize, String burger_description, int burger_imageId) {
        this.burger_name = burger_name;
        this.burger_prize = burger_prize;
        this.burger_description = burger_description;
        this.burger_imageId = burger_imageId;
    }

    public String getBurger_name() {
        return burger_name;
    }

    public void setBurger_name(String burger_name) {
        this.burger_name = burger_name;
    }

    public String getBurger_prize() {
        return burger_prize;
    }

    public void setBurger_prize(String burger_prize) {
        this.burger_prize = burger_prize;
    }

    public String getBurger_description() {
        return burger_description;
    }

    public void setBurger_description(String burger_description) {
        this.burger_description = burger_description;
    }

    public int getBurger_imageId() {
        return burger_imageId;
    }

    public void setBurger_imageId(int burger_imageId) {
        this.burger_imageId = burger_imageId;
    }
}