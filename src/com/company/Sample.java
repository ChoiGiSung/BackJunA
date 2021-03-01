package com.company;

public class Sample {

    static {
        System.out.println("셈플1");
    }
    static Sample2 sample2;

    public static void main(String[] args) {
        sample2=new Sample2();
    }



}

class Sample2{
    static {
        System.out.println("셈플2");
    }
    public Sample2() {
        System.out.println("셈플2");
    }
}
