package com.lucasgarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgarcia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
