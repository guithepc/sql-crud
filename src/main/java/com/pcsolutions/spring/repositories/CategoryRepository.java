package com.pcsolutions.spring.repositories;

import com.pcsolutions.spring.entities.Category;
import com.pcsolutions.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
