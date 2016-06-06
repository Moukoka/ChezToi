package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.Supplier;
import com.mouks.rosie.cheztoi.factories.SupplierFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/05/31.
 */
public class SupplierFactoryTest extends TestCase {
    public void testCreate() throws Exception {

        Supplier order = SupplierFactory.getSupplier("Sup1","Moulinex");
        Assert.assertEquals("PROD1", order.getProductID());
    }

    public void testUpdate() throws Exception{
        Supplier order = SupplierFactory.getSupplier("Sup1", "Moulinex");
        Supplier newSupplier = new Supplier.Builder().copy(order).product("PROD1").build();
        Assert.assertEquals("PROD1", newSupplier.getProductID());
    }
}
