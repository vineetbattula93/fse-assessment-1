package com.cognizant.assessment.model;

public class Product {

    private long productId;
    private String productName;
    private double productPrice;
    private double discountedPrice;



    public Product(long productId, String productName, double productPrice, double discountedPrice) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.discountedPrice = discountedPrice;
    }
    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public double getDiscountedPrice() {
        return discountedPrice;
    }
    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }




}
