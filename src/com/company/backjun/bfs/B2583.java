package com.company.backjun.bfs;

import java.util.*;

public class B2583 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int N,M;
    static int[][] arr;
    static boolean[][] check;
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        check = new boolean[N][M];
        int all = sc.nextInt();

        for (int i = 0; i <all; i++) {
            int y1 = sc.nextInt();
            int x1 = sc.nextInt();
            int y2 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y= y1; y <y2 ; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(!check[i][j] && arr[i][j] != 1){
                    bfs(i,j);
                }
            }

        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            int get = arrayList.get(i) != 1 ? arrayList.get(i)-1 : 1;
            System.out.println(get);
        }
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x,y));
        int count= 0;

        while (!q.isEmpty()){
            Node node = q.poll();
            count++;
            for (int i = 0; i < 4; i++) {
                int nextX = node.x + dx[i];
                int nextY = node.y + dy[i];

                if(nextX <0 || nextY <0 || nextX >= N || nextY >=M){
                    continue;
                }
                if(check[nextX][nextY] || arr[nextX][nextY] == 1){
                    continue;
                }

                q.add(new Node(nextX,nextY));
                check[nextX][nextY] = true;
            }

        }
        arrayList.add(count);
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
