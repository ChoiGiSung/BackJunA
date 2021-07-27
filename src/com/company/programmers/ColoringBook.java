package com.company.programmers;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ColoringBook {
    static int[][] arr;
    static int M;
    static int N;
    static boolean[][] check;
    static List<Integer> list = new ArrayList<>();
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};


    class Solution {
        public int[] solution(int m, int n, int[][] picture) {

            int[] answer = new int[2];



            M = m;
            N = n;
            arr = new int[M][N];
            check = new boolean[M][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = picture[i][j];
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (!check[i][j] && arr[i][j] != 0) {
                        bfs(i, j);
                    }
                }
            }

            answer[0] = list.size();
            answer[1] = Collections.max(list);

            return answer;
        }

        private void bfs(int x, int y) {
            Queue<Node> q = new LinkedList<>();
            check[x][y] = true;
            q.add(new Node(x, y));
            int count = 1;
            while (!q.isEmpty()) {
                Node node = q.poll();
                int nowColor = arr[node.x][node.y];
                for (int i = 0; i < 4; i++) {
                    int nextX = node.x + dx[i];
                    int nextY = node.y + dy[i];

                    if (nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
                        continue;
                    }

                    if(check[nextX][nextY] || arr[nextX][nextY] != nowColor){
                        continue;
                    }

                    q.add(new Node(nextX,nextY));
                    check[nextX][nextY] = true;
                    count++;
                }

            }
            list.add(count);

        }

        class Node {
            int x;
            int y;

            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
    }

    @Test
    public void  sample(){
        Solution solution = new Solution();
        int[] solution1 = solution.solution(3,3,new int[][]{{0, 1, 0}, {1, 1, 0}, {0, 0, 0}});
        for (int i : solution1) {
            System.out.println(i);
        }
//        Assertions.assertEquals();
    }
}
