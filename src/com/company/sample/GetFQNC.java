package com.company.sample;

import java.util.function.Function;
import java.util.function.Supplier;

public enum GetFQNC {

    SAMPLE1(() ->"com.company.sample."+"Sample1"),
    SAMPLE2(() ->"com.company.sample."+"Sample2");

    private Supplier<String> addString;

    GetFQNC(Supplier<String> addString) {
        this.addString = addString;
    }

    public String getFQNC() {
        return addString.get();
    }


}
