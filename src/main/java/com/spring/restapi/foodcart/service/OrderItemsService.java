package com.spring.restapi.foodcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.foodcart.model.OrderItem;
import com.spring.restapi.foodcart.repository.OrderItemsRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderItemsService {

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    public void addOrderedProducts(OrderItem orderItem) {
        orderItemsRepository.save(orderItem);
    }


}
