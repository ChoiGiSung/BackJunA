package com.company.programmers.runing;

import java.util.Stack;

public class Segun {

    boolean check[][];
    int[][] box;
    int max;

    class Solution {
        public int[][] solution(int rows, int columns, int max_virus, int[][] queries) {
            int[][] answer;
            box = new int[rows][columns];
            max = max_virus;

            for (int[] query : queries) {
                check = new boolean[rows][columns];
                bfs(query[0] - 1,query[1]- 1);
            }

            answer = new int[rows][columns];

            for (int i = 0; i < answer.length; i++) {
                int[] ints = answer[i];
                for (int j = 0; j < ints.length; j++) {
                    ints[j] = box[i][j];
                }
            }

            return answer;
        }

        private void bfs(int r, int c) {
            if(!(r >=0 && r<box.length && c>=0 && c<box[0].length)){
                return;
            }
            if(check[r][c]){
                return;
            }

            check[r][c] = true;


            if(box[r][c] == max){
                //상하좌우 ㄱㄱ
                bfs(r-1,c);
                bfs(r+1,c);
                bfs(r,c-1);
                bfs(r,c+1);
            }else {
                box[r][c]+=1;
            }
        }
    }
}
