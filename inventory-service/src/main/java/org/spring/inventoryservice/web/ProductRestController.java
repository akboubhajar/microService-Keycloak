package org.spring.inventoryservice.web;


import org.spring.inventoryservice.entities.Product;
import org.spring.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> productList() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id) {
        return productRepository.findById(id).get();
    }
}