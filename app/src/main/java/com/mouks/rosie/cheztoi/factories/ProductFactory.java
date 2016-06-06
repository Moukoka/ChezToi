package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.Product;

/**
 * Created by Rosie on 2016/05/30.
 */
public class ProductFactory {
    public static Product getProdcut(String name, String desc, double price){
        return new Product.Builder()
                .name(name).description(desc).price(price)
                .build();
    }
}
