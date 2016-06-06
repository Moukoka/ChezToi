package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.Personel;

import java.util.Date;

/**
 * Created by Rosie on 2016/05/30.
 */
public class PersonelFactory {
    public static Personel getPersonel(String name, String surname){
        return new Personel.Builder()
                .name(name).date(new Date()).surname(surname)
                .build();
    }
}
