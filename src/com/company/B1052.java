package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;

import java.util.*;
public class B1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count =0;
        int answer=0;

        while (true){
            count=getCount(N);
            if(K>=count){ //나머지 물통이 k개 보다 적으면 ok
                System.out.println(answer);
                break;
            }else { //많으면 물통 수를 늘린다 == 물통을 하나 더 산다.
                N++;
                answer++;
            }
        }

    }

    //물통을 최소로 만들때 나머지 물통의 수를 구해라.
    private static int getCount(int N) {
        int count=0;
        while (N != 0){
            if(N%2 !=0){
                count++;// 나머지 물통
            }
            N /=2;
        }
        return count;
    }
}
