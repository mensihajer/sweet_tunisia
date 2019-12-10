package com.DSI31g2.sweet_tunisia;

public class Destination {
    private String describe_destination;
    private String localisation_destination;

    public Destination(String string, String describe_destination, String localisation_destination) {
        this.describe_destination = describe_destination;
        this.localisation_destination = localisation_destination;
    }

    public String getDescribe_destination() {
        return describe_destination;
    }

    public void setDescribe_destination(String describe_destination) {
        this.describe_destination = describe_destination;
    }

    public String getLocalisation_destination() {
        return localisation_destination;
    }

    public void setLocalisation_destination(String localisation_destination) {
        this.localisation_destination = localisation_destination;
    }
}
