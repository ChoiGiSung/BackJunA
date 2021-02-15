package com.company.backjun;


import java.text.MessageFormat;
import java.util.Scanner;

import java.util.*;
public class B4796 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        String message="Case {0}: {1}";
        while (true){
            int L= sc.nextInt();
            int P= sc.nextInt();
            int V= sc.nextInt();

            count++;
            if(P== 0 && V == 0){
                return;
            }
            int One= (V/P)*L;


            One += (V%P) > L? L : (V%P);

            //정답
            String s = "Case " + count + ": " + One;

            //오답
            String format = MessageFormat.format(message, count, One);

            //예시는 둘 다 true가 나옵니다.
            System.out.println(s.equals(format));

        }
    }
}
