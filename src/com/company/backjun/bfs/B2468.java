package com.company.backjun.bfs;

import java.util.*;

public class B2468 {

    static boolean[][] check;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][]arr;
    static Map<Integer,Integer> map= new HashMap<>();
    static int all;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        all = sc.nextInt();
        arr = new int[all][all];

        for (int i = 0; i < all; i++) {
            for (int j = 0; j < all; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int k = 1; k <= 100; k++) {
            check = new boolean[all][all];
            int count = 0;
            for (int i = 0; i < all; i++) {
                for (int j = 0; j < all; j++) {
                    if(arr[i][j]>=k && !check[i][j]){
                        bfs(i,j,k);
                        count++;
                    }
                }
            }
            map.put(count,k);
        }

        int max= 0;

        for (Integer integer : map.keySet()) {
            if(max < integer){
                max = integer;
            }
        }

        System.out.println(max);
    }

    private static void bfs(int i, int j,int max) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i,j));
        check[i][j] = true;

        while (!q.isEmpty()){
            Node node = q.poll();

            for (int k = 0; k < 4; k++) {

                int nextX = node.x + dx[k];
                int nextY = node.y + dy[k];

                if(nextX <0 || nextY <0 || nextX>=all||nextY>=all){
                    continue;
                }

                if(check[nextX][nextY] || arr[nextX][nextY] < max){
                    continue;
                }

                q.add(new Node(nextX,nextY));
                check[nextX][nextY] = true;

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
