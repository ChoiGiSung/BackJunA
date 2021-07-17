package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2178 {

    static int[][] arr;
    static boolean[][] check;
    static int N;
    static int M;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,-1,0,1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        arr = new int[N][M];
        check = new boolean[N][M];

        for(int i =0;i<N;i++){
            String str = sc.nextLine();
            for (int j = 0; j <M; j++) {
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        check[0][0] = true;
        bfs(0,0);
        System.out.println(arr[N-1][M-1]);
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x,y));

        while (!q.isEmpty()){
            Node node = q.poll();

            for (int i =0;i<4;i++){
                int nextX=node.x + dx[i];
                int nextY=node.y + dy[i];

                if(nextX <0 || nextY<0 || nextX >= N || nextY >= M){
                    continue;
                }

                if(check[nextX][nextY] || arr[nextX][nextY] == 0){
                    continue;
                }

                q.add(new Node(nextX,nextY));
                arr[nextX][nextY] = arr[node.x][node.y] + 1;
                check[nextX][nextY] = true;
            }
        }
    }


}
class Node{
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
