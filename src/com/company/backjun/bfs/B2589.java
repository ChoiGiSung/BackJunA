package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2589 {

    static int N;
    static int M;
    static boolean[][] check;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][]apart;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N =sc.nextInt();
        M = sc.nextInt();
        check = new boolean[N][M];
        apart=new int[N][M];


        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W'){
                    apart[i][j] = 0;
                }else {
                    apart[i][j] = 1;
                }
            }
        }


        int max=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(apart[i][j] == 1){
                   max= Math.max(max,bfs(i,j,deepCopy(apart)));
                }
            }
        }

        System.out.println(max-1);
    }

    public static int bfs(int n, int m,int[][] apart){
        Queue<Node> q = new LinkedList<>();
        check = new boolean[N][M];
        int count =0;
        q.add(new Node(n,m));
        check[n][m] = true;

        while (!q.isEmpty()){
            Node node = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = node.x + dx[i];
                int nextY = node.y + dy[i];

                if(nextX <0 || nextY <0 || nextX>=N||nextY>=M){
                    continue;
                }

                if(check[nextX][nextY] || apart[nextX][nextY] == 0){
                    continue;
                }

                q.add(new Node(nextX,nextY));
                apart[nextX][nextY] = apart[node.x][node.y] + 1;
                check[nextX][nextY] = true;
            }
        }
        for (int[] ints : apart) {
            for (int anInt : ints) {
                count = Math.max(anInt,count);
            }
        }
        return count;

    }
    private static int[][] deepCopy(int[][] original2) {
        if(original2 == null) return null;
        int[][] result = new int[original2.length][original2[0].length];

        for(int i=0; i<original2.length; i++){
            System.arraycopy(original2[i], 0, result[i], 0, original2[0].length);
        }

        return result;
    }
    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

