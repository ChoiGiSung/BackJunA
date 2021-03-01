package com.company;

@FunctionalInterface
public interface Funtion {

    String sample();
    boolean equals(Object s);

    int hashCode();

    default int sam(){
        return 0;
    };
}
