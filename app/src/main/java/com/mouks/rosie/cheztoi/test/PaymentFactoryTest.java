package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.Payments;
import com.mouks.rosie.cheztoi.factories.PaymentFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/05/31.
 */
public class PaymentFactoryTest extends TestCase {
    public void testCreate() throws Exception {

        Payments payment = PaymentFactory.getPayment("paid","credit");
        Assert.assertEquals("paid", payment.getStatus());
    }

    public void testUpdate() throws Exception{
        Payments payment = PaymentFactory.getPayment("paid","credit");
        Payments newPayment = new Payments.Builder().copy(payment).payment("cash").build();
        Assert.assertEquals("cash", newPayment.getPaymentMethod());
    }
}
