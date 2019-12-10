package com.DSI31g2.sweet_tunisia;

public class Restaurant {
    private String describe;
    private String localisation;

    public Restaurant(String describe, String localisation) {
        this.describe = describe;
        this.localisation = localisation;
    }



    public String getDescribe() {
        return describe;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
}
