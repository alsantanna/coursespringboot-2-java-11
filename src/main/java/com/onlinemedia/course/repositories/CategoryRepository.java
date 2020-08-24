package com.onlinemedia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemedia.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
