package com.company.backjun.class3;

import java.util.Scanner;

public class B5525 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int all = sc.nextInt();
        String realString = makeString(all);

        for (int i = 0; i <1; i++) {
            int localAll = sc.nextInt();
            String string = sc.next();
            int count = 0;
            for (int j = 0; j < localAll-realString.length(); j++) {
                if(string.substring(j,j+realString.length()).equals(realString)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static String makeString(int all) {
        StringBuilder builder = new StringBuilder();
        builder.append("I");
        for (int i = 0; i < all; i++) {
             builder.append("OI");
        }

        return builder.toString();

    }
}
