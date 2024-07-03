package com.abhi.OrderService;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Order {
    private User user;
    private Food food;
}
