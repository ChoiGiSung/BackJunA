package com.company;

import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int input1=sc.nextInt();
        int input2=sc.nextInt();

        int result1=Math.abs(((input1-1)%4)-((input2-1)%4));
        int result2=Math.abs(((input1-1)/4)-((input2-1)/4));

        int result= result1+result2;
        System.out.print(result);
    }
}
