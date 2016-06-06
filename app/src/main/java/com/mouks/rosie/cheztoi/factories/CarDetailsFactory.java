package com.mouks.rosie.cheztoi.factories;

import com.mouks.rosie.cheztoi.domain.CarDetails;

/**
 * Created by Rosie on 2016/05/30.
 */
public class CarDetailsFactory {
    public static CarDetails getCard(String type, String num){
        return new CarDetails.Builder()
                .card(num).cardType(type)
                .build();
    }
}
