package com.lucasgarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgarcia.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
