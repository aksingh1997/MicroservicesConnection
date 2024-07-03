package com.abhi.OrderService;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class User {
    private int id;
    private String userName;
}
