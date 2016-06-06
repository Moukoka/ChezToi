package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class Payments implements Serializable {
    private Long id;
    private String paymentMethod;
    private String status;
    private String customerId;

    public Payments() {
    }

    public Long getId() {
        return id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Payments(Builder builder) {
        this.id = builder.id;
        this.customerId= builder.customerId;
        this.paymentMethod = builder.paymentMethod;
        this.status = builder.status;

    }
    public static class Builder{
        private Long id;
        private String paymentMethod;
        private String status;
        private String customerId;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder payment(String value){
            this.paymentMethod = value;
            return this;
        }

        public Builder status(String value){
            this.status = value;
            return this;
        }

        public Builder customerId(String value){
            this.customerId = value;
            return this;
        }

        public Builder copy(Payments val) {
            this.id = val.id;
            this.customerId= val.customerId;
            this.paymentMethod = val.paymentMethod;
            this.status = val.status;
            return this;
        }

        public Payments build(){
            return new Payments(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payments payments = (Payments) o;

        if (!id.equals(payments.id)) return false;
        return customerId.equals(payments.customerId);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + customerId.hashCode();
        return result;
    }
}
