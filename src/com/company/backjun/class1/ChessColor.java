package com.company.backjun.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChessColor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
         final char[][] white = { // (0,0)이 W일 때 가질 수 있는 규칙이다.
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'}
        };

         final char[][] black = { // (0,0)이 B일 때 가질 수 있는 규칙이다.
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'}
        };

        char[][] chars = new char[N][M];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            chars[i] = sc.next().toCharArray();
        }

        // 여태 첫번째 칸이 기준인줄.... -> 반례 만약 첫번째 칸만 바꾸면 최소일 경우는?
        for (int i = 0; i <= N - 8; i++) {
            //세로 몇번
            int count = 0;

            for (int j = 0; j <= M - 8; j++) {
                //세로 증가
                int W = 0;
                int B = 0;
                //가로 검증

                for (int k = i; k < 8 + i; k++) {

                    for (int l = j; l < 8 + j; l++) {
                        if(chars[k][l] != black[k-i][l-j]){
                            B++;
                        }
                        if (chars[k][l] != white[k-i][l-j]){
                            W++;
                        }
                    }
                }
                result.add(Math.min(B,W));
            }
        }
        System.out.println(Collections.min(result));
    }
}
