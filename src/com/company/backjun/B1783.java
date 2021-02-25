package com.company.backjun;

import java.util.Scanner;

public class B1783 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pawn pawn=new Pawn();
        int count=1;

        int move[][]={{2,1},{-2,1},{1,2},{-1,2}};

        String[] split = sc.nextLine().split(" ");
        int N= Integer.parseInt(split[0]);
        int M= Integer.parseInt(split[1]);

        while (pawn.flag){

            int nowCount=count;
            for (int[] ints : move) {
                if(pawn.height+ints[0] <= N && pawn.height+ints[0] > 0 && pawn.width+ints[1] <= M){
                    pawn.add(ints[0],ints[1]);
                    count++;
                }
            }
            if (nowCount == count){
                System.out.println(count);
                return;
            }
        }
    }

    static class Pawn{
        int height=1;
        int width=1;
        boolean flag=true;

        public void add(int height,int width){
            this.height+=height;
            this.width+=width;
        }

    }
}
