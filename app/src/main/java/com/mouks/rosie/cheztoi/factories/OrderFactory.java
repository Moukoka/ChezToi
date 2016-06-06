package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.Order;

/**
 * Created by Rosie on 2016/05/30.
 */
public class OrderFactory {
    public static Order getOrder(String prod,int qty){
        return new Order.Builder().product(prod).quantity(qty)
                .build();
    }
}
