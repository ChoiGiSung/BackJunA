package com.company.backjun;

import java.util.*;
public class B10757 {

    public static int[] fulladder(String endStr, String endStr2, int carry){
        int[] answer= new int[2];
        int sum = Integer.parseInt(endStr) + Integer.parseInt(endStr2) + carry;
        answer[0]=sum/10; //자리올림 -> 10의 자릿수
        answer[1]=sum%10; //합 -> 1의 자릿수
        return answer;
    }


    public static String putStr(String str,int length){
        int len=length-str.length();
        for (int i = 0; i <len ; i++) {
            str="0"+str;
        }
        return str;
    }

    private static String getString(String input1, String input2, int length) {
        String result="";
        int carry=0;
        for (int i = 0; i < length; i++) {
            // 마지막 글자 따기
            String endstr1= input1.substring(input1.length()-i-1, input1.length()-i);
            String endstr2= input2.substring(input2.length()-i-1, input2.length()-i);
            int[] findInt = fulladder(endstr1, endstr2, carry);
            result = findInt[1]+""+ result; //합
            carry = findInt[0]; // 자리올림
        }
        result = carry + result;

        if(result.substring(0,1).equals("0")){
            result = result.substring(1, result.length());
        }
        return result;
    }

    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);

        String input1=sc.next();
        String input2=sc.next();

        int length= Math.max(input1.length(),input2.length());
        //둘의 글자를 아예 맞춰주자
        input1=putStr(input1,length);
        input2=putStr(input2,length);

        String result = getString(input1, input2,length);

        System.out.println(result);

    }



}