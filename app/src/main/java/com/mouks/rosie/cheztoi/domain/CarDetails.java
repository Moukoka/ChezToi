package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class CarDetails implements Serializable {
    private Long id;
    private String cardNumber;
    private String customerId;
    private String cardType;

    public CarDetails() {
    }
    public CarDetails(Builder builder) {
        this.id= builder.id;
        this.cardNumber= builder.cardNumber;
        this.customerId= builder.customerId;
        this.cardType = builder.cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public Long getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public static class Builder{
        private Long id;
        private String cardNumber;
        private String customerId;
        private String cardType;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder card(String value){
            this.cardNumber = value;
            return this;
        }

        public Builder customer(String value){
            this.customerId = value;
            return this;
        }

        public Builder cardType(String value){
            this.cardType = value;
            return this;
        }


        public Builder copy(CarDetails val) {
            this.id = val.id;
            this.cardNumber = val.cardNumber;
            this.customerId = val.customerId;
            this.cardType = val.cardType;
            return this;
        }

        public CarDetails build(){
            return new CarDetails(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarDetails that = (CarDetails) o;

        if (!id.equals(that.id)) return false;
        return customerId.equals(that.customerId);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + customerId.hashCode();
        return result;
    }
}
