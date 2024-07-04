package com.abhi.OrderService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class OrderBuildService {

    @Autowired
    UserService userService;

    List<Food> foodList = new ArrayList<>();

    public Order buildOrder(int userId, int foodId) {
        Order order = null;
        try {
           order = Order.builder().food(foodList.stream().filter(x -> x.getFoodId() == foodId).findAny().orElse(null))
                    .user(userService.getUser(userId))
                    .build();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  order;
    }

    public void addManyFoods(List<Food> foods) {
        foodList.addAll(foods);
    }
}
