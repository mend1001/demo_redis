package com.demo_spring_cache_app.demo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Map;

@Document(collection = "product_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEventDoc {

    @Id
    private String id;

    private Long productId;              // ID del producto en Postgres
    private String type;                 // CREATED / UPDATED / DELETED
    private String source;               // api / init
    private Map<String, Object> payload; // flexible
    private Instant createdAt;
}

