package com.cognizant.assessment.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private long cartId;
    private ArrayList<LineItem> items;

    public Cart() {
        items = new ArrayList<LineItem>();
    }

    public long getCartId() {
        return cartId;
    }
    public void setCartId(long cartId) {
        this.cartId = cartId;
    }
    public List<LineItem> getItems() {
        return items;
    }
    public void setItems(ArrayList<LineItem> items) {
        this.items = items;
    }

    public void addItem(LineItem item) {
        this.items.add(item);
    }

    public void removeItem(LineItem item) {
        this.items.remove(item);
    }

    public void increaseQuantity(LineItem item) {
        int newQuantity = (item.getProductQuantity());
        item.setProductQuantity(++newQuantity);
    }

    public void decreaseQuantity(LineItem item) {
        int newQuantity = (item.getProductQuantity());
        item.setProductQuantity(--newQuantity);
    }
}
