package com.javaudemy.course.repositories;

import com.javaudemy.course.entities.Category;
import com.javaudemy.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
