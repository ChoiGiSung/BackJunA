package com.company.backjun.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B11724 {

    static int [][] node;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int count = 0;

        int all = sc.nextInt();
        int len = sc.nextInt();
        node = new int[all][all];
        check = new boolean[all];

        for (int i = 0; i <len; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            node[a][b] = 1;
            node[b][a] = 1;
        }


        for (int i = 0; i < all; i++) {
            if(!check[i]){
                bfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()){
            Integer nodes = q.poll();

            for (int i = 0; i < check.length; i++) {
                 if(!check[i] && node[nodes][i] == 1){
                     check[i] = true;
                     q.add(i);
                 }
            }
        }
    }

}
