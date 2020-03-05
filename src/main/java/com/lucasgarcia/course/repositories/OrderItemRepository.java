package com.lucasgarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgarcia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
