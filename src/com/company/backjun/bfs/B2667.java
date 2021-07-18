package com.company.backjun.bfs;

import java.util.*;

public class B2667 {

    static int N;
    static int M;
    static boolean[][] check;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static ArrayList<Integer> result = new ArrayList<>();
    static int[][]apart;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        N = n;
        M = n;
        check = new boolean[N][M];
        apart=new int[n][n];


        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                apart[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                //방문하지 않았다면
                if(apart[i][j] == 1 && check[i][j] == false){
                    bfs(i,j);
                }
            }
        }
        System.out.println(result.size()); // 각 단지의 수는 ArrayList의 size
        Collections.sort(result); // 오름차순 출력을 위한 정렬
        for(int i =0; i<result.size();i++) { // 각 단지의 집 수를 출력
            System.out.println(result.get(i));
        }
    }

    public static void bfs(int n, int m){
        Queue<Node> q = new LinkedList<>();
        int count =0;
        q.add(new Node(n,m));
        check[n][m] = true;

        while (!q.isEmpty()){
            Node node = q.poll();
            count++;

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
                check[nextX][nextY] = true;
            }
        }

        result.add(count);
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
