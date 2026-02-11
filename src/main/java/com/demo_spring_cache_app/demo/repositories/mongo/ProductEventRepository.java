package com.demo_spring_cache_app.demo.repositories.mongo;

import com.demo_spring_cache_app.demo.entities.ProductEventDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductEventRepository
        extends MongoRepository<ProductEventDoc, String> {

    List<ProductEventDoc>
    findTop20ByProductIdOrderByCreatedAtDesc(Long productId);
}

