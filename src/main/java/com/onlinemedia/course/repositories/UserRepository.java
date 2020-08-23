package com.onlinemedia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemedia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
