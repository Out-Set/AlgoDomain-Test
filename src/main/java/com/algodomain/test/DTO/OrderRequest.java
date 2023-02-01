package com.algodomain.test.DTO;

import com.algodomain.test.Entity.Category;

public class OrderRequest {

    private Category category;

    public OrderRequest() {

    }

    public OrderRequest(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
