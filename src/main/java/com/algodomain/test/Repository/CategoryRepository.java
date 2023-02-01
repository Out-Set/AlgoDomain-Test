package com.algodomain.test.Repository;

import com.algodomain.test.DTO.OrderResponse;
import com.algodomain.test.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, String> {

    @Query("SELECT new com.algodomain.test.DTO.OrderResponse(c.productCategory, p.productName) FROM Category c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
