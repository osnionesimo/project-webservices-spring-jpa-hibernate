package com.javaudemy.course.repositories;

import com.javaudemy.course.entities.Category;
import com.javaudemy.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
