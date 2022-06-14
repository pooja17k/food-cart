package com.spring.restapi.foodcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.foodcart.model.Cart;
import com.spring.restapi.foodcart.model.User;
import com.spring.restapi.foodcart.model.WishList;

import java.util.List;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

    List<Cart> deleteByUser(User user);

}

