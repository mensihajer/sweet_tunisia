package com.DSI31g2.sweet_tunisia;

public class Caffe {
    private String describe_caffe;
    private String localisation_caffe;

    public Caffe(String describe_caffe, String localisation_caffe) {
        this.describe_caffe = describe_caffe;
        this.localisation_caffe = localisation_caffe;
    }

    public String getDescribe_caffe() {
        return describe_caffe;
    }

    public void setDescribe_caffe(String describe_caffe) {
        this.describe_caffe = describe_caffe;
    }

    public String getLocalisation_caffe() {
        return localisation_caffe;
    }

    public void setLocalisation_caffe(String localisation_caffe) {
        this.localisation_caffe = localisation_caffe;
    }
}
