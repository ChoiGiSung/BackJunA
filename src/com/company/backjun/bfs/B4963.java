package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B4963 {

    static int[][] arr;
    static int[] dx ={-1,0,1,0,-1,1,1,-1};
    static int[] dy ={0,-1,0,1,-1,-1,1,1};
    static int N;
    static int M;
    static boolean[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            M = sc.nextInt();
            N = sc.nextInt();
            if(M == 0 && N == 0){
                break;
            }
            arr = new int[N][M];
            check = new boolean[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //표 만들기 끝

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(!check[i][j] && arr[i][j] == 1){
                        bfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }


    }

    private static void bfs(int i, int j) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i,j));
        check[i][j] = true;

        while(!q.isEmpty()){
            Node node = q.poll();

            for (int k = 0; k < 8; k++) {
                int nextX = node.x + dx[k];
                int nextY = node.y + dy[k];

                if(nextX <0 ||nextY <0 || nextX>=N || nextY>=M){
                    continue;
                }

                if(check[nextX][nextY] || arr[nextX][nextY] == 0){
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
