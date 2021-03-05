package com.example.pizzapub;

public class ComboData {
    private String combo_name,combo_prize,combo_description;
    private int combo_imageId;

    public ComboData() {
    }

    public ComboData(String combo_name, String combo_prize, String combo_description, int combo_imageId) {
        this.combo_name = combo_name;
        this.combo_prize = combo_prize;
        this.combo_description = combo_description;
        this.combo_imageId = combo_imageId;
    }

    public String getCombo_name() {
        return combo_name;
    }

    public void setCombo_name(String combo_name) {
        this.combo_name = combo_name;
    }

    public String getCombo_prize() {
        return combo_prize;
    }

    public void setCombo_prize(String combo_prize) {
        this.combo_prize = combo_prize;
    }

    public String getCombo_description() {
        return combo_description;
    }

    public void setCombo_description(String combo_description) {
        this.combo_description = combo_description;
    }

    public int getCombo_imageId() {
        return combo_imageId;
    }

    public void setCombo_imageId(int combo_imageId) {
        this.combo_imageId = combo_imageId;
    }
}
