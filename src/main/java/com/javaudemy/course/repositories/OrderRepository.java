package com.javaudemy.course.repositories;

import com.javaudemy.course.entities.Order;
import com.javaudemy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
