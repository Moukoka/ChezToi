package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class Supplier implements Serializable {
    private Long id;
    private String supplierId;
    private String name, surname;
    private Long cellNumber;
    private Long faxNumber;
    private String productID;

    public Supplier() {
    }

    public Long getId() {
        return id;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getCellNumber() {
        return cellNumber;
    }

    public Long getFaxNumber() {
        return faxNumber;
    }

    public String getProductID() {
        return productID;
    }

    public Supplier(Builder builder) {
        this.id =builder.id;
        this.supplierId = builder.supplierId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.cellNumber = builder.cellNumber;
        this.faxNumber = builder.faxNumber;
        this.productID = builder.productID;
    }

    public static class Builder{
        private Long id;
        private String supplierId;
        private String name, surname;
        private Long cellNumber;
        private Long faxNumber;
        private String productID;

        public Builder id(Long value){
            this.id = value;
            return this;
        }


        public Builder supplier(String value){
            this.supplierId = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder cell(Long value){
            this.cellNumber= value;
            return this;
        }
        public Builder fax(Long value){
            this.faxNumber= value;
            return this;
        }
        public Builder product(String value){
            this.productID = value;
            return this;
        }

        public Builder copy(Supplier val) {
            this.id = val.id;
            this.name = val.name;
            this.name = val.name;
            this.surname = val.surname;
            this.cellNumber = val.cellNumber;
            this.faxNumber = val.faxNumber;
            this.productID= val.productID;

            return this;
        }

        public Supplier build(){
            return new Supplier(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (!id.equals(supplier.id)) return false;
        if (!supplierId.equals(supplier.supplierId)) return false;
        return productID.equals(supplier.productID);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + supplierId.hashCode();
        result = 31 * result + productID.hashCode();
        return result;
    }
}
