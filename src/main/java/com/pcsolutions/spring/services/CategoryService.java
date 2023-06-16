package com.pcsolutions.spring.services;

import com.pcsolutions.spring.entities.Category;
import com.pcsolutions.spring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll(){
        return CategoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category = CategoryRepository.findById(id);
        return category.get();
    }


}
