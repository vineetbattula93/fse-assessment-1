package com.cognizant.assessment.model;

public class LineItem {

    private long lineItemId;
    private Product product;
    private int productQuantity;



    public LineItem(long lineItemId, Product product, int productQuantity) {
        super();
        this.lineItemId = lineItemId;
        this.product = product;
        this.productQuantity = productQuantity;
    }
    public long getLineItemId() {
        return lineItemId;
    }
    public void setLineItemId(long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }


    public double getDiscountedPrice() {
        double total = 0;
        total = this.productQuantity *  this.product.getDiscountedPrice();

        return total;
    }

    public double getUndiscountedPrice() {
        double total = 0;
        total = this.productQuantity * this.product.getProductPrice();

        return total;
    }

}
