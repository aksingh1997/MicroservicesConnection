package com.abhi.UserService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDataService {

    List<User> userList = new ArrayList<>();

    public void addManyUsers(List<User> users) {
        userList.addAll(users);
    }

    public User getUser(int id) {
        return userList.stream().filter(x -> x.getId() == id).findAny().orElseThrow();
    }
}
