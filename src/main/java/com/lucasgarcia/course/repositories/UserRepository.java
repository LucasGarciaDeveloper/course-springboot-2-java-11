package com.lucasgarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgarcia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
