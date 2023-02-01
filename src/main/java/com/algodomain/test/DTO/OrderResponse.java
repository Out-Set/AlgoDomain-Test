package com.algodomain.test.DTO;

public class OrderResponse {

    private String productCategory;
    private String productName;

    public OrderResponse(String productCategory, String productName) {
        this.productCategory = productCategory;
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
