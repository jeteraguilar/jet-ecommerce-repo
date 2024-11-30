package com.jet.ecommerce.controllers;

import com.jet.ecommerce.entities.Product;
import com.jet.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}