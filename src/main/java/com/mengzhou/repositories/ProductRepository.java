package com.mengzhou.repositories;

import com.mengzhou.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Optional custom method
    Page<Product> findByCategory(String category, Pageable pageable);
}
