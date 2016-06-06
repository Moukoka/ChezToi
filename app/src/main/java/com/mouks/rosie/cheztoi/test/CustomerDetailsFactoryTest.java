package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.CustomerDetails;
import com.mouks.rosie.cheztoi.factories.CustomerDetailsFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rosie on 2016/05/31.
 */
public class CustomerDetailsFactoryTest extends TestCase {
    public void testCreate() throws Exception {
        Map<String,String> values = new HashMap<String,String>();
        values.put("customerId","Cust001");
        values.put("name","Mali");
        values.put("username","Mali001");
        values.put("password", "Mal1");
        CustomerDetails customer = CustomerDetailsFactory.getCustomer(values);
        Assert.assertEquals("Mali",customer.getName());
        Assert.assertEquals("Mal1",customer.getPassword());
    }

    public void testUpdate() throws Exception{
        Map<String,String> values = new HashMap<String,String>();
        values.put("customerId","Cust002");
        values.put("password", "Mino");
        CustomerDetails customer = CustomerDetailsFactory.getCustomer(values);
        CustomerDetails newCustomer = new CustomerDetails.Builder().copy(customer).password("Milo").build();

        Assert.assertEquals("Milo",newCustomer.getPassword());
    }
}
