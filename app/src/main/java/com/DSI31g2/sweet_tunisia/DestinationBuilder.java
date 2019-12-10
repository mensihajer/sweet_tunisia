package com.DSI31g2.sweet_tunisia;

public class DestinationBuilder {
    private String describe_destination;
    private String localisation_destination;


    public void setDescribe_destination(String describe_destination) {
        this.describe_destination = describe_destination;
    }

    public void setLocalisation_destination(String localisation_destination) {
        this.localisation_destination = localisation_destination;
    }

    public Caffe createCaffe() {

        return new Caffe(describe_destination, localisation_destination);
    }
}
