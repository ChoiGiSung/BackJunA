package com.company.backjun.greedy;
import java.util.*;
public class B1009 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int all= sc.nextInt();


        for (int i = 0; i <all; i++) {
            int input1=sc.nextInt();
            int input2=sc.nextInt();

            int answer=1;
            for (int j = 0; j < input2; j++) {
                answer *=input1;
                answer %=10;
            }
            if(answer == 0){
                answer=10;
            }
            System.out.println(answer);
        }

    }

}
