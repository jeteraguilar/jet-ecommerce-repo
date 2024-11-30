package com.jet.ecommerce.controllers;

import com.jet.ecommerce.entities.Category;
import com.jet.ecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
