package com.company.sample;

import java.util.function.Supplier;

public enum GetFQNC2 {

    SAMPLE1("com.company.sample."+"Sample1"),
    SAMPLE2("com.company.sample."+"Sample2");

    GetFQNC2(String addString) {
        this.addString = addString;
    }

    private String addString;

    public String getFQNC() {
        return addString;
    }

}
