package com.demo_spring_cache_app.demo.controllers;

import com.demo_spring_cache_app.demo.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
