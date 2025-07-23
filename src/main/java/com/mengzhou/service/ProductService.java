package com.mengzhou.service;

import com.mengzhou.dto.ProductDTO;
import com.mengzhou.entities.Product;
import com.mengzhou.mapper.ProductMapper;
import com.mengzhou.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<ProductDTO> getProducts(String category, Pageable pageable) {
        Page<Product> products;

        if (category != null && !category.isEmpty()) {
            products = productRepository.findByCategory(category, pageable);
        } else {
            products = productRepository.findAll(pageable);
        }

        return products.map(ProductMapper.INSTANCE::toDTO);
    }
}