package com.spring.restapi.foodcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.foodcart.model.Cart;
import com.spring.restapi.foodcart.model.Order;
import com.spring.restapi.foodcart.model.User;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {
    List<Order> findAllByUserOrderByCreatedDateDesc(User user);

}
