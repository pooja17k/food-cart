package com.spring.restapi.foodcart.dto.order;

import javax.validation.constraints.NotNull;

import com.spring.restapi.foodcart.model.Order;

public class OrderDto {
    private Integer id;
    private @NotNull Integer userId;

    public OrderDto() {
    }

    public OrderDto(Order order) {
        this.setId(order.getId());
        //this.setUserId(order.getUserId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
