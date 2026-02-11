package com.demo_spring_cache_app.demo.serviceimpl;


import com.demo_spring_cache_app.demo.entities.ProductEventDoc;
import com.demo_spring_cache_app.demo.entities.ProductEntity;
import com.demo_spring_cache_app.demo.repositories.mongo.ProductEventRepository;
import com.demo_spring_cache_app.demo.repositories.postgres.ProductRepository;
import com.demo_spring_cache_app.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductEventRepository eventRepository;

    public ProductServiceImpl(ProductRepository productRepository,
                              ProductEventRepository eventRepository) {
        this.productRepository = productRepository;
        this.eventRepository = eventRepository;
    }


    @Override
    public ProductEntity getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Producto no encontrado: " + id));
    }

    @Override
    public List<ProductEventDoc> getProductEvents(Long productId) {
        return eventRepository
                .findTop20ByProductIdOrderByCreatedAtDesc(productId);
    }
}

