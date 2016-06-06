package com.mouks.rosie.cheztoi.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/05/29.
 */
public class GoodsOrder implements Serializable {
    private Long id;
    private String goodsId;
    private String supplierId;
    private int quantity;

    public GoodsOrder() {
    }
    public GoodsOrder(Builder builder) {
        this.id = builder.id;
        this.goodsId = builder.goodsId;
        this.supplierId= builder.supplierId;
        this.quantity = builder.quantity;
    }

    public Long getd() {
        return id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public int getQuantity() {
        return quantity;
    }

    public static class Builder{
        private Long id;
        private String goodsId;
        private String supplierId;
        private int quantity;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder goods(String value){
            this.goodsId = value;
            return this;
        }

        public Builder supplier(String value){
            this.supplierId = value;
            return this;
        }

        public Builder qty(int value){
            this.quantity = value;
            return this;
        }

        public Builder copy(GoodsOrder val) {
            this.id = val.id;
            this.goodsId = val.goodsId;
            this.supplierId = val.supplierId;
            this.quantity = val.quantity;
            return this;
        }

        public GoodsOrder build(){
            return new GoodsOrder(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsOrder that = (GoodsOrder) o;

        if (!id.equals(that.id)) return false;
        if (!goodsId.equals(that.goodsId)) return false;
        return supplierId.equals(that.supplierId);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + goodsId.hashCode();
        result = 31 * result + supplierId.hashCode();
        return result;
    }
}
