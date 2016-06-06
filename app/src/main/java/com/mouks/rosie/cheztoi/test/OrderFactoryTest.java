package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.Order;
import com.mouks.rosie.cheztoi.factories.OrderFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

//import org.junit.Test;
/**
 * Created by Rosie on 2016/05/31.
 */
public class OrderFactoryTest extends TestCase {

    public void testCreate() throws Exception {

        Order order = OrderFactory.getOrder("PROD1", 2);
        Assert.assertEquals("PROD1", order.getProductID());
    }

    public void testUpdate() throws Exception{
        Order order = OrderFactory.getOrder("PROD1",2);
        Order newOrder = new Order.Builder().copy(order).product("PROD2").build();
        Assert.assertEquals("PROD2", newOrder.getProductID());
    }


}