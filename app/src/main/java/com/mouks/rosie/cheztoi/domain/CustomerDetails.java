package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class CustomerDetails implements Serializable {
    private Long id;
    private String customerId;
    private String name, username;
    private String password;
    private int age;

    public CustomerDetails() {
    }

    public CustomerDetails(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.username = builder.username;
        this.password = builder.password;
        this.age = builder.age;
        this.customerId = builder.customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
    public static class Builder{
        private Long id;
        private String name, username;
        private String password;
        private int age;
        private String customerId;

        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder customer(String value){
            this.customerId = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder age(int value){
            this.age = value;
            return this;
        }

        public Builder copy(CustomerDetails val) {
            this.id = val.id;
            this.name = val.name;
            this.username = val.username;
            this.password = val.password;
            this.age = val.age;
            this.customerId=val.customerId;
            return this;
        }

        public CustomerDetails build(){
            return new CustomerDetails(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerDetails that = (CustomerDetails) o;

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
