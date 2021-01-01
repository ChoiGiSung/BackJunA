package com.company;

import com.company.DDSns.Facebook;

import java.sql.*;
import java.util.Date;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int all=sc.nextInt();

        for (int i = 0; i <all; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int aClon=1;
            for (int j = 0; j <b; j++) {
                aClon=(aClon*a)%10;
            }
            if (aClon == 0){
                System.out.println(10);
                continue;
            }
            System.out.println(aClon);
        }
    }
}
