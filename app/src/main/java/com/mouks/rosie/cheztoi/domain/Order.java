package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class Order implements Serializable {
    private Long id;
    private String productID, customerId, orderId;
    private int quantity;

    public Order() {
    }
    public Order(Builder builder) {
        this.id=builder.id;
        this.customerId=builder.customerId;
        this.productID=builder.productID;
        this.orderId=builder.orderId;
        this.quantity=builder.quantity;
    }

    public Long getId() {
        return id;
    }

    public String getProductID() {
        return productID;
    }

    public String getCustomerId() {
        return customerId;
    }
    public String getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public static class Builder{
        private Long id;
        private String productID, customerId,orderId;
        private int quantity;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder product(String value){
            this.productID = value;
            return this;
        }

        public Builder customer(String value){
            this.customerId= value;
            return this;
        }

        public Builder order(String value){
            this.orderId = value;
            return this;
        }

        public Builder quantity(int value){
            this.quantity = value;
            return this;
        }

        public Builder copy(Order val) {
            this.id = val.id;
            this.orderId = val.orderId;
            this.productID= val.productID;
            this.customerId = val.customerId;
            this.quantity = val.quantity;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (!id.equals(order.id)) return false;
        if (!productID.equals(order.productID)) return false;
        if (!customerId.equals(order.customerId)) return false;
        return orderId.equals(order.orderId);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + productID.hashCode();
        result = 31 * result + customerId.hashCode();
        result = 31 * result + orderId.hashCode();
        return result;
    }
}
