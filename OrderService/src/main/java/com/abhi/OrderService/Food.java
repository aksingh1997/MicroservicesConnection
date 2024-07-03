package com.abhi.OrderService;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Food {
    int foodId;
    String foodName;
}
