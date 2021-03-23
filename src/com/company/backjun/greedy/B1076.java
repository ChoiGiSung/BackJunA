package com.company.backjun.greedy;

import java.util.*;
public class B1076 {
    static HashMap<String,HashMap<String,Integer>> color=new HashMap<>();

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        putHashmap();

        String input1=sc.next();
        String input2=sc.next();
        String input3=sc.next();

        String key="";
        key = getString(key,input1);
        key = getString(key,input2);


        Long resultInt=Long.parseLong(key); //w w w 일때 오류 -> long형으로
        resultInt = getaLong(input3, resultInt);

        System.out.print(resultInt);
    }

    private static void putHashmap() {
        color.put("black", new HashMap<>() {{put("0", 1);}});
        color.put("brown", new HashMap<>() {{put("1", 10);}});
        color.put("red", new HashMap<>() {{put("2", 100);}});
        color.put("orange", new HashMap<>() {{put("3", 1000);}});
        color.put("yellow", new HashMap<>() {{put("4", 10000);}});
        color.put("green", new HashMap<>() {{put("5", 100000);}});
        color.put("blue", new HashMap<>() {{put("6", 1000000 );}});
        color.put("violet", new HashMap<>() {{put("7", 10000000);}});
        color.put("grey", new HashMap<>() {{put("8", 100000000);}});
        color.put("white", new HashMap<>() {{put("9", 1000000000);}});
    }

    private static Long getaLong(String input,Long resultInt) {
        HashMap<String, Integer> stringIntegerHashMap1 = color.get(input);
        Iterator<String> iterator = stringIntegerHashMap1.keySet().iterator();
        while (iterator.hasNext()){
            Integer integer = stringIntegerHashMap1.get(iterator.next());
            resultInt *=integer;
        }
        return resultInt;
    }

    private static String getString(String key,String input) {
        Iterator<String> iterator1 = color.get(input).keySet().iterator();
        while (iterator1.hasNext()) {
            key += iterator1.next();
        }
        return key;
    }

}
