package com.spring.restapi.foodcart.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.restapi.foodcart.model.WishList;
import com.spring.restapi.foodcart.repository.WishListRepository;


@Service
@Transactional
public class WishListService {

    private final WishListRepository wishListRepository;

    public WishListService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public void createWishlist(WishList wishList) {
        wishListRepository.save(wishList);
    }

    public List<WishList> readWishList(Integer userId) {
        return wishListRepository.findAllByUserIdOrderByCreatedDateDesc(userId);
    }
}
