package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class Cart implements Serializable{
    private Long id;
    private String customerId, productID;
    private int quantity;
    private String status, deliveryStatus;
    private double total;

    public Cart() {
    }
    public Cart(Builder builder) {
        this.id = builder.id;
        this.customerId= builder.customerId;
        this.productID= builder.productID;
        this.quantity= builder.quantity;
        this.status = builder.status;
        this.deliveryStatus= builder.deliveryStatus;
        this.total = builder.total;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public double getTotal() {
        return total;
    }

    public static class Builder{
        private Long id;
        private String customerId, productID;
        private int quantity;
        private String status, deliveryStatus;
        private double total;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder customer(String value){
            this.customerId = value;
            return this;
        }

        public Builder product(String value){
            this.productID = value;
            return this;
        }

        public Builder status(String value){
            this.status = value;
            return this;
        }
        public Builder delivery(String value){
            this.deliveryStatus = value;
            return this;
        }
        public Builder total(double value){
            this.total = value;
            return this;
        }

        public Builder quantity(int value){
            this.quantity = value;
            return this;
        }

        public Builder copy(Cart val) {
            this.id = val.id;
            this.customerId= val.customerId;
            this.productID= val.productID;
            this.quantity= val.quantity;
            this.status = val.status;
            this.deliveryStatus= val.deliveryStatus;
            this.total = val.total;
            return this;
        }

        public Cart build(){
            return new Cart(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (!id.equals(cart.id)) return false;
        if (!customerId.equals(cart.customerId)) return false;
        return productID.equals(cart.productID);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + customerId.hashCode();
        result = 31 * result + productID.hashCode();
        return result;
    }
}
