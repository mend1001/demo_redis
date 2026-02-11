package com.demo_spring_cache_app.demo.services;

import com.demo_spring_cache_app.demo.entities.ProductEventDoc;
import com.demo_spring_cache_app.demo.entities.ProductEntity;

import java.util.List;

public interface ProductService {

    ProductEntity getProductById(Long id);

    List<ProductEventDoc> getProductEvents(Long productId);
}

