package com.DSI31g2.sweet_tunisia;

public class RestaurantBuilder {
    private String describe;
    private String localisation;


    public RestaurantBuilder setDescribe(String describe) {
        this.describe = describe;
        return this;
    }

    public RestaurantBuilder setLocalisation(String localisation) {
        this.localisation = localisation;
        return this;
    }


    public Restaurant createRestaurant() {

        return new Restaurant(cursor.getString(0), describe, localisation);
    }
}
