package com.abhi.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    OrderBuildService service;

    @GetMapping("/prepareOrder/{userid}/{foodId}")
    public Order prepareOrder(@PathVariable int userId, @PathVariable  int foodId) throws Exception {
        return service.buildOrder(userId, foodId);
    }

    @PostMapping("/addManyFoods")
    public String addManyFoods(@RequestBody List<Food> foods) {
        service.addManyFoods(foods);
        return  "foods added";
    }
}
