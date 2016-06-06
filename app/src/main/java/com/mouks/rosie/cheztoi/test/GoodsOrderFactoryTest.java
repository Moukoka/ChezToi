package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.GoodsOrder;
import com.mouks.rosie.cheztoi.factories.GoodsOrderFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/05/31.
 */
public class GoodsOrderFactoryTest extends TestCase {
    public void testCreate() throws Exception {

        GoodsOrder order = GoodsOrderFactory.getGoods("GFlour",23);
        Assert.assertEquals("GFlour", order.getGoodsId());
    }

    public void testUpdate() throws Exception{
        GoodsOrder order = GoodsOrderFactory.getGoods("GFlour", 23);
        GoodsOrder newOrder = new GoodsOrder.Builder().copy(order).qty(50).build();
        Assert.assertEquals("50", newOrder.getQuantity());
    }
}
