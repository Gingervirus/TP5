package com.SchoolApp.domain;

/**
 * Created by Armin on 2016-04-04.
 */
public class Clothes
{
    private String itemID;
    private String name;
    private int quantity;
    private double price;

    public Clothes() {
    }

    public Clothes(String itemID, String name, int quantity, double price) {
        this.itemID = itemID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "itemID='" + itemID + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
