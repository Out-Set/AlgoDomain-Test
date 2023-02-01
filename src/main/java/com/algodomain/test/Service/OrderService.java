package com.algodomain.test.Service;

import com.algodomain.test.Entity.Category;
import com.algodomain.test.Entity.Product;
import com.algodomain.test.Repository.CategoryRepository;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;

@Service
public class OrderService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    // Calcutale discount
    Product product = new Product();

    int basePrice = product.getProductPrice();

}
