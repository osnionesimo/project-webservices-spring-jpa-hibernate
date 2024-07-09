package com.javaudemy.course.repositories;

import com.javaudemy.course.entities.Category;
import com.javaudemy.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
