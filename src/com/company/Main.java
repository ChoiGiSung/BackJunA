package com.company;

import javax.swing.*;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        boolean isUser=true;
        boolean isAdult=true;
        boolean isFaint=true;

        makeMember(isAdult ? 15:20, isFaint ? 100:1_000_000, isUser ? "일반유저":"관리자");

    }


    public static void makeMember(int age,int money,String position){
        System.out.println( "당신은 "+position+" 나이는 : "+age+"잔고는 : "+money);
    }
}

