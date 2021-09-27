package com.company.sample;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Scanner scanner =new Scanner(System.in);
//        String Input = scanner.nextLine();
//
//        try {
//            String getFQNC =getFQNC(Input);
//            Class aClass = Class.forName(getFQNC);
//            Action getAction = (Action) aClass.getDeclaredConstructor().newInstance();
//            getAction.exec();
//
//        } catch (Exception e){}
//
//
//        GetFQNC getFQNC=GetFQNC.SAMPLE1;
//        System.out.println(getFQNC.getFQNC());


        Sample1 sample1=new Sample1();
        Sample1 sample2=new Sample1();

        Sample1 [] Strs=new Sample1[2];
        Strs[0]=sample1;
        Strs[1]=sample2;

        Sample1 [] Strs2=new Sample1[2];
        Strs2[0]=sample1;
        Strs2[1]=sample2;


        boolean equals = Arrays.equals(Strs, Strs2);
        boolean b = Arrays.deepEquals(Strs, Strs2);

        System.out.println(equals); //t
        System.out.println(b);  //t

    }

//    private static String getFQNC(String Input) {
//        return switch (Input){
//            case "sample1" ->GetFQNC2.SAMPLE1.getFQNC();
//            case "sample2" ->GetFQNC2.SAMPLE2.getFQNC();
//            default -> throw new IllegalStateException("Unexpected value: " + Input);
//        };
//    }

    private static String getMessage(int id, String name, int age){
        //String result="당신의 id는"+id+"당신의 이름은 : "+name+"당신의 나이는 "+age;

        String message="당신의 id는 {0} 당신의 이름은 : {1} 당신의 나이는 {2}";
        String messageResult = MessageFormat.format(message, id, name, age);

        return messageResult;
    }
}

