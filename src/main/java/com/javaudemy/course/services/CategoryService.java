package com.javaudemy.course.services;

import com.javaudemy.course.entities.Category;
import com.javaudemy.course.entities.Order;
import com.javaudemy.course.repositories.CategoryRepository;
import com.javaudemy.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll()
    {
        return repository.findAll();
    }

    public Category findById(Long id)
    {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
