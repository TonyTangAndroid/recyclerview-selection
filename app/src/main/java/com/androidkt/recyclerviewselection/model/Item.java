package com.androidkt.recyclerviewselection.model;

import java.util.Objects;

/**
 * Created by brijesh on 26/3/18.
 */

public class Item {
    private long itemId;
    private float itemPrice;
    private String itemName;

    public Item(long itemId) {
        this.itemId = itemId;
    }

    public Item() {
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemId == item.itemId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(itemId);
    }
}
