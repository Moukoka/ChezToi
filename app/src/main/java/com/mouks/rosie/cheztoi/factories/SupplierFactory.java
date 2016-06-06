package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.Supplier;

/**
 * Created by Rosie on 2016/05/30.
 */
public class SupplierFactory {
    public static Supplier getSupplier(String supplierId, String name){
        return new Supplier.Builder()
                .supplier(supplierId).name(name)
                .build();

    }
}
