package com.abhi.OrderService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userService", url = "http://localhost:9081/")
public interface UserService {

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id);
}
