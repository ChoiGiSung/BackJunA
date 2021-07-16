package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int len = sc.nextInt();

        int[][] node = new int[com][com];
        int[] check = new int[com];

        for (int i = 0; i < len; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            node[a][b] = 1;
            node[b][a] = 1;
        }



        bfs(0,node,check);
    }

    private static void bfs(int start, int[][] node, int[] check) {
        Queue<Integer> q = new LinkedList<>();

        check[start] = 1;

        q.add(start);
        int count =0;
        while (!q.isEmpty()){
            Integer poll = q.poll();

            for (int i = 0; i < node.length; i++) {
               if(node[poll][i] == 1 && check[i] !=1){
                   q.add(i);
                   check[i] = 1;
                   count++;
               }

            }

        }

        System.out.println(count);
    }

}
