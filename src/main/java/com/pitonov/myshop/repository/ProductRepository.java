package com.pitonov.myshop.repository;

import com.pitonov.myshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Long> {
    Product findById(long id);
    List<Product> findAllByOrderByIdAsc();
    List<Product> findByNameContainingIgnoreCase(String keyword);
}
