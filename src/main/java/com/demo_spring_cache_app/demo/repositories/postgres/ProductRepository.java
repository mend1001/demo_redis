package com.demo_spring_cache_app.demo.repositories.postgres;


import com.demo_spring_cache_app.demo.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}

