package com.algodomain.test.Service;

import com.algodomain.test.Entity.Product;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    // Get all Products
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    // Get Product by Id
    public Product getProductById(int id){
        return productRepository.findByProductId(id);
    }


    // Add a Product
    public Product addAProduct(Product product){
        return productRepository.save(product);
    }

    // Add Multiple Product
    public List<Product> addManyProduct(List<Product> product){
        return productRepository.saveAll(product);
    }


    // Delete a Product by Id
    public String deleteProductById(int id){
        productRepository.deleteByProductId(id);
        return "product deleted";
    }

    // Update a product
    public Product updateProduct(Product product){
        Product existingProduct;

        // Check whether Product exists or not
        existingProduct = productRepository.findByProductId(product.getProductId());

        // If exists, do the followings
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductType(product.getProductType());
        existingProduct.setProductPrice(product.getProductPrice());

        return productRepository.save(existingProduct);
    }
}
