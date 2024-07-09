package com.abhi.OrderService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserService {

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id);
}
