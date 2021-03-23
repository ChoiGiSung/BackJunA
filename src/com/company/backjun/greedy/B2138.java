package com.company.backjun.greedy;

import java.util.Scanner;

import java.util.*;

public class B2138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        sc.nextLine();

        String first = sc.nextLine();
        String second = sc.nextLine();

        char[] getFirst = first.toCharArray();
        char[] getSecond = second.toCharArray();

        int count = 0;

        for (int i = 0; i < getSecond.length; i++) {

            if(i == 0){
                if(getFirst[i] != getSecond[i]){

                    getFirst[i] = change(getFirst[i]);
                    getFirst[i + 1] = change(getFirst[i + 1]);
                    count++;
                }
                continue;
            }

            if (i == getSecond.length - 1) {
                if(Arrays.equals(getFirst,getSecond)){
                   break;
                }
                if (getFirst[i - 1] != getSecond[i - 1]) {
                    getFirst[i - 1] = change(getFirst[i - 1]);
                    getFirst[i] = change(getFirst[i]);
                    count++;

                }
                if(!Arrays.equals(getFirst,getSecond)){
                    count=-1;
                    break;
                }
            }

            if (getFirst[i - 1] != getSecond[i - 1]) {
                getFirst[i - 1] = change(getFirst[i - 1]);
                getFirst[i] = change(getFirst[i]);
                getFirst[i + 1] = change(getFirst[i + 1]);
                count++;
            }
        }

        System.out.println(count);
    }

    public static char change(char ch) {
        return ch == '0' ? '1' : '0';
    }
}
