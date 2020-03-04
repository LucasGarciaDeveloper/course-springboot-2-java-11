package com.lucasgarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgarcia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
