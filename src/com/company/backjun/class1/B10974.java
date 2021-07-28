package com.company.backjun.class1;

import java.util.Scanner;

public class B10974 {

    static int[] arr;
    static int[] output;
    static boolean[] check;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];
        output = new int[n];
        check = new boolean[n];
        N = n;

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        dfs(0);
    }

    private static void dfs(int depth) {
        if(depth == N){
            for (int i : output) {
                System.out.print(i);
            }
            System.out.println("");
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!check[i]){
                check[i] = true;
                output[depth] = arr[i];
                dfs(depth+1);
                check[i] = false;
            }

        }
    }
}
