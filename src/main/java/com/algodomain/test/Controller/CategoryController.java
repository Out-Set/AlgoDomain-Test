package com.algodomain.test.Controller;

import com.algodomain.test.Entity.Category;
import com.algodomain.test.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping("/charges")
    public List<Category> getCharges(){
        return categoryRepository.findAll();
    }
}
