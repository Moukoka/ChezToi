package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.Product;
import com.mouks.rosie.cheztoi.factories.ProductFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/05/31.
 */
public class ProductFactoryTest extends TestCase {
    public void testCreate() throws Exception {

        Product product = ProductFactory.getProdcut("Flour","Wheat Flour",5.40);
        Assert.assertEquals("Flour", product.getName());
    }

    public void testUpdate() throws Exception{
        Product product = ProductFactory.getProdcut("Flour", "Wheat Flour", 5.40);
        Product newProduct = new Product.Builder().copy(product).price(5.90).build();
        Assert.assertEquals("5.90", newProduct.getPrice());
    }
}
