package org.spring.inventoryservice.repository;

import org.spring.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
