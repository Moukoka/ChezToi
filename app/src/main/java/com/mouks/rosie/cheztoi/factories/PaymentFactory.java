package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.Payments;

/**
 * Created by Rosie on 2016/05/30.
 */
public class PaymentFactory {
    public static Payments getPayment(String stat, String payMethod){
        return new Payments.Builder().status(stat).payment(payMethod).build();
    }
}
