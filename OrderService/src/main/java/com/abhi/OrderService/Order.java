package com.abhi.OrderService;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private User user;
    private Food food;
}
