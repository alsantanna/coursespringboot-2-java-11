package com.onlinemedia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemedia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
