package com.company.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FriendBlock {

    class Solution {
        String[][] WriteBoar;

        public int solution(int m, int n, String[] board) {
            int answer = 0;
            WriteBoar = new String[m][n];

            getWriteBoar(board);


            while (true) {
                Queue<Integer[]> Ar = new LinkedList<>();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < m - 1; j++) {
                        if (!WriteBoar[j][i].equals("0") &&
                                WriteBoar[j][i].equals(WriteBoar[j][i + 1]) &&
                                WriteBoar[j][i].equals(WriteBoar[j + 1][i]) &&
                                WriteBoar[j][i].equals(WriteBoar[j + 1][i + 1])) {
                            Ar.add(new Integer[]{j, i});
                        }

                    }
                }

                if (Ar.isEmpty())
                    break;
                changeZero(Ar);
                moveToZero();

            }

            //0인 곳을 밑으로 내리기

            return CountZero();
        }

        private void getWriteBoar(String[] board) {

            //2차원 배열로 만들기
            for (int i = 0; i < WriteBoar.length; i++) {
                WriteBoar[i] = board[i].split("");
            }
        }

        public void changeZero(Queue<Integer[]> Ar) {

            while (!Ar.isEmpty()) {
                Integer[] getAr = Ar.poll();
                int i = getAr[1];
                int j = getAr[0];

                WriteBoar[j][i] = String.valueOf(0);
                WriteBoar[j][i + 1] = String.valueOf(0);
                WriteBoar[j + 1][i] = String.valueOf(0);
                WriteBoar[j + 1][i + 1] = String.valueOf(0);
            }

        }

        public void moveToZero() {
            boolean flag = true;
            while (flag) {
                flag=false;
                for (int i = 0; i < WriteBoar.length - 1; i++) {

                    for (int j = 0; j < WriteBoar[0].length; j++) {
                        if (!WriteBoar[i][j].equals("0") &&
                                WriteBoar[i + 1][j].equals("0")) {
                            WriteBoar[i + 1][j] = WriteBoar[i][j];
                            WriteBoar[i][j] = "0";
                            flag=true;
                        }

                    }
                }
            }

        }

        public int CountZero() {
            int count = 0;
            for (int i = 0; i < WriteBoar.length; i++) {

                for (int j = 0; j < WriteBoar[0].length; j++) {
                    if (WriteBoar[i][j].equals("0"))
                        ++count;

                }
            }
            return count;
        }


    }

}
