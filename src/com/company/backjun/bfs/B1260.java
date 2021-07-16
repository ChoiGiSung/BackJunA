package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class B1260 {
    static int[][] node;
    static int[] bfsCheck;
    static int[] dfsCheck;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int len = sc.nextInt();
        int start = sc.nextInt() - 1;

        node = new int[all][all];
        bfsCheck = new int[all];
        dfsCheck = new int[all];

        for (int i = 0; i < len; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            node[a][b] = 1;
            node[b][a] = 1;

        }
        dfs(start);
        System.out.println("");
        bfs(start);
    }

    private static void dfs(int start) {
        Stack<Integer> s = new Stack<>();
        dfsCheck[start] = 1;

        s.add(start);
        System.out.print(start+1+" ");
        while (!s.isEmpty()) {
            for (int i = 0; i < dfsCheck.length; i++) {
                if (node[start][i] == 1 && dfsCheck[i] != 1) {
                    s.add(i);
                    dfsCheck[i] = 1;
                    dfs(i);
                }
            }
            s.pop();
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        bfsCheck[start] = 1;

        q.add(start);

        while (!q.isEmpty()) {
            Integer poll = q.poll();

            System.out.print(poll+1+" ");
            for (int i = 0; i < bfsCheck.length; i++) {
                if (node[poll][i] == 1 && bfsCheck[i] != 1) {
                    q.add(i);
                    bfsCheck[i] = 1;
                }

            }
        }
    }
}
