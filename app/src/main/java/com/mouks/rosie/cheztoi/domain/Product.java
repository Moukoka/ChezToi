package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class Product implements Serializable {
    private Long id;
    private String productID;
    private String name, description;
    private double price;

    public Product() {}
    public Product(Builder builder) {
       this.id = builder.id;
        this.productID = builder.productID;
        this.name = builder.name;
        this.description= builder.description;
        this.price = builder.price;
    }


    public Long getId() {
        return id;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder{
        private Long id;
        private String productID;
        private String name, description;
        private double price;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder product(String value){
            this.productID = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder description(String value){
            this.description = value;
            return this;
        }

        public Builder price(double value){
            this.price = value;
            return this;
        }

        public Builder copy(Product val) {
            this.id = val.id;
            this.productID = val.productID;
            this.name= val.name;
            this.description= val.description;
            this.price = val.price;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        return productID.equals(product.productID);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + productID.hashCode();
        return result;
    }
}
