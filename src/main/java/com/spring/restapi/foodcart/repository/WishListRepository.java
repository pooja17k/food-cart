package com.spring.restapi.foodcart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.foodcart.model.WishList;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

    List<WishList> findAllByUserIdOrderByCreatedDateDesc(Integer userId);


}
