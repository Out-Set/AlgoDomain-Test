package com.algodomain.test.Controller;

import com.algodomain.test.Entity.Product;
import com.algodomain.test.Repository.ProductRepository;
import com.algodomain.test.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    // Get APIs
    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable  int id) {
        return productService.getProductById(id);
    }

    // Post APIs
    @PostMapping("/product")
    public Product addAProduct(@RequestBody Product product) {
        return productService.addAProduct(product);
    }

    @PostMapping("/products")
    public List<Product> addManyProduct(@RequestBody List<Product> product) {
        return productService.addManyProduct(product);
    }


    // Update APIs
    @PutMapping("/product")
    public Product updateAProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }


    // Delete APIs
    @DeleteMapping("/product/{id}")
    public String deleteByProductId(@PathVariable int id) {
        return productService.deleteProductById(id);
    }
}
