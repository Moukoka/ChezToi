package com.mouks.rosie.cheztoi.services;

import android.content.Context;

import com.mouks.rosie.cheztoi.domain.CustomerDetails;

/**
 * Created by Rosie on 2016/06/06.
 */
public interface CustomerService {
    void addCustomer(Context context, CustomerDetails customer);
    void resetCustomer(Context context);
}
