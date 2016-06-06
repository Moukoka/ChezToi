package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.CustomerDetails;

import java.util.Map;

/**
 * Created by Rosie on 2016/05/29.
 */
public class CustomerDetailsFactory {
    public static CustomerDetails getCustomer(Map<String, String > customer){
        return new CustomerDetails.Builder()
                //.customer(customer.get("customerId"))
                //.name(customer.get("name"))
                .username(customer.get("username"))
                .password(customer.get("password"))
                .build();
    }
}
