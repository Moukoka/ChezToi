package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.GoodsOrder;

/**
 * Created by Rosie on 2016/05/30.
 */
public class GoodsOrderFactory {
    public static GoodsOrder getGoods(String id,int qty){
        return new GoodsOrder.Builder().goods(id).qty(qty)
                .build();
    }
}
