package com.algodomain.test;

import com.algodomain.test.Entity.Category;
import com.algodomain.test.Entity.Product;
import com.algodomain.test.Repository.CategoryRepository;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository chargesRepository;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Product Table
//		productRepository.save( new Product("Lenovo Yoga",	"Laptop", "Electronics",45000));
//		productRepository.save( new Product("LG Washing Machine", "Washing Machine", "Home Appliances", 25000));
//		productRepository.save( new Product("HP Pavilion 360",	"Laptop", "Electronics", 60000));
//		productRepository.save( new Product("US Polo Assn", "T-Shirt", "Clothing", 1200));
//		productRepository.save( new Product("Neelkamal Been Bag", "Sofa Set", "Furniture", 350));

		// Charges Table
//		chargesRepository.save( new Category("Electronics", 15, 18, 350));
//		chargesRepository.save( new Category("Home Appliances", 22, 24, 800));
//		chargesRepository.save( new Category("Clothing",	40, 12, 0));
//		chargesRepository.save( new Category("Furniture",10, 18, 300));
	}
}
