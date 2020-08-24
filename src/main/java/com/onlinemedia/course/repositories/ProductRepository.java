package com.onlinemedia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemedia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
