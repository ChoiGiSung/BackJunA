package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B7576 {
    //https://zoonvivor.tistory.com/131

    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        bfs(N,M);

        print(arr);

    }

    private static void print(int[][] arr) {
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <M; j++) {
                if(arr[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max-1);
    }

    private static void bfs(int n, int m) {
        Queue<Node> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 1){
                    q.add(new Node(i,j));
                }
            }
        }

        while (!q.isEmpty()){
            Node node = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = node.x + dx[i];
                int nextY = node.y + dy[i];

                if(nextX <0 || nextY <0|| nextX>=N ||nextY>=M){
                    continue;
                }

                if(check[nextX][nextY] || arr[nextX][nextY] != 0){
                    continue;
                }

                check[nextX][nextY] = true;
                arr[nextX][nextY] = arr[node.x][node.y] +1;
                q.add(new Node(nextX,nextY));

            }
        }

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

