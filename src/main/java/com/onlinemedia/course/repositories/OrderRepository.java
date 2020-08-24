package com.onlinemedia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemedia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
