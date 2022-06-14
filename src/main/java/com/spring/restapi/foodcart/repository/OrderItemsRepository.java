package com.spring.restapi.foodcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restapi.foodcart.model.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
