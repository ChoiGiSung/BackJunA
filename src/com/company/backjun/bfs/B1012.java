package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1012 {

    static int N;
    static int M;
    static boolean check[][];
    static int arr[][];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();

        for (int s = 0; s < all; s++) {
            N = sc.nextInt();
            M = sc.nextInt();
            check = new boolean[N][M];
            arr = new int[N][M];

            int beaCu =sc.nextInt();

            for (int i = 0; i < beaCu; i++) {
                arr[sc.nextInt()][sc.nextInt()] = 1;
            }

            int answer = 0;
            for (int i = 0; i <N; i++) {
                for (int j = 0; j < M; j++) {
                    if(!check[i][j] && arr[i][j] == 1){
                        bfs(i,j,arr);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }

    }
    private static void bfs(int i, int j, int[][] computers) {
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(i,j));

        while (!q.isEmpty()){
            Node node = q.poll();

            for (int k = 0; k < 4; k++) {
                int nextX = node.x + dx[k];
                int nextY = node.y + dy[k];

                if(nextX < 0 || nextY <0 || nextX >=N || nextY >=M){
                    continue;
                }

                if(check[nextX][nextY]||computers[nextX][nextY]==0){
                    continue;
                }

                check[nextX][nextY] = true;
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
