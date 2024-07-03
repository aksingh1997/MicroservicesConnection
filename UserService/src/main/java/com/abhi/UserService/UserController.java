package com.abhi.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDataService service;

    @PostMapping("/addManyUsers")
    public String addManyUsers(@RequestBody List<User> users) {
        service.addManyUsers(users);
        return "user Added";
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id) {
        return service.getUser(id);
    }

}