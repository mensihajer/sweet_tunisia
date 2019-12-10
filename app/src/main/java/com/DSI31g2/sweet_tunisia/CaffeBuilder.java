package com.DSI31g2.sweet_tunisia;

public class CaffeBuilder {
    private String describe_caffe;
    private String localisation_caffe;


    public void setDescribe_caffe(String describe_caffe) {
        this.describe_caffe = describe_caffe;
    }

    public void setLocalisation_caffe(String localisation_caffe) {
        this.localisation_caffe = localisation_caffe;
    }

    public Caffe createCaffe() {

        return new Caffe(describe_caffe, localisation_caffe);
    }
}
