package com.company.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

    // https://zoonvivor.tistory.com/77
    static boolean[][]check;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int N;
    static int M;

    class Solution {
        public int solution(int[][] maps) {
            int answer = 0;
            N = maps.length;
            M = maps[0].length;
            check = new boolean[N][M];
            check[0][0] = true;

            bfs(0,0,maps);


            return maps[N-1][M-1] ==1 ? -1:maps[N-1][M-1];
        }

        private void bfs(int x, int y,int[][]maps) {
            Queue<Node> q = new LinkedList<>();
            q.add(new Node(x,y));


            while (!q.isEmpty()){
                Node node = q.poll();

                for (int i = 0; i < 4; i++) {
                    int nextX = node.x + dx[i];
                    int nextY = node.y + dy[i];

                    if(nextX <0 || nextY <0|| nextX >=N || nextY >=M){
                        continue;
                    }

                    if(check[nextX][nextY] ||maps[nextX][nextY] == 0){
                        continue;
                    }

                    q.add(new Node(nextX,nextY));
                    maps[nextX][nextY] = maps[node.x][node.y] + 1;
                    check[nextX][nextY] = true;

                }
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