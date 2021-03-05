package com.example.pizzapub;

public class MyListData {
    private String name,prize,description;
    private int imageId;

    public MyListData() {
    }

    public MyListData(String name, String prize, String description, int imageId) {
        this.name = name;
        this.prize = prize;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
