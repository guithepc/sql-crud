package com.pcsolutions.spring.repositories;

import com.pcsolutions.spring.entities.Category;
import com.pcsolutions.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
