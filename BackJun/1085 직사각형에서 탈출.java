package com.company;

import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();


        int Xresult=Math.min(x,Math.abs(w-x));
        int Yresult=Math.min(y,Math.abs(h-y));

        int outPut=Xresult>Yresult ? Yresult:Xresult;

        System.out.println(outPut);
    }
}
