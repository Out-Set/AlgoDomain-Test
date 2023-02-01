package com.algodomain.test.Controller;

import com.algodomain.test.DTO.OrderRequest;
import com.algodomain.test.DTO.OrderResponse;
import com.algodomain.test.Entity.Category;
import com.algodomain.test.Repository.CategoryRepository;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Category placeOrder(@RequestBody OrderRequest request) {
        return categoryRepository.save(request.getCategory());
    }

    @GetMapping("/findAllOrders")
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return categoryRepository.getJoinInformation();
    }
}
