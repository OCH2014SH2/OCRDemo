package com.oracle.sh.groupa.ocrdemo.dataStructure;

/**
 * Created by Alfred on 15/1/8.
 */
public class ReceiptInfo {
    private String title;
    private String dateTime;
    private double price;

    public ReceiptInfo(String title, String dateTime, double price) {
        this.title = title;
        this.dateTime = dateTime;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}