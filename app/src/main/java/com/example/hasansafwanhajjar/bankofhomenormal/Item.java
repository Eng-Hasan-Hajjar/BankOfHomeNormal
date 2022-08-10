package com.example.hasansafwanhajjar.bankofhomenormal;

/**
 * Created by Hasan Safwan Hajjar on 04/29/2018.
 */

public class Item {
    private String name;
    private int price;
    private String typeOfItem;
    private String date;

    public Item(String name, int price, String typeOfItem, String date) {
        this.name = name;
        this.price = price;
        this.typeOfItem = typeOfItem;
        this.date = date;
    }

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

    public String getTypeOfItem() {
        return typeOfItem;
    }

    public void setTypeOfItem(String typeOfItem) {
        this.typeOfItem = typeOfItem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
