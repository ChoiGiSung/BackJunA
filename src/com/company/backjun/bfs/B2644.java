package com.company.backjun.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2644 {

    static int[][] arr;
    static boolean[]check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allPeople = sc.nextInt();
        int targetOne = sc.nextInt()-1;
        int targetSecond = sc.nextInt()-1;

        arr = new int[allPeople][allPeople];
        check = new boolean[allPeople];

        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            int son = sc.nextInt()-1;
            int per = sc.nextInt()-1;

            arr[son][per] = 1;
            arr[per][son] = 1;
        }

        int bfs = bfs(targetOne, targetSecond);
        System.out.println(bfs);
    }

    private static int bfs(int targetOne, int targetSecond) {
        Queue<Node> q =new LinkedList<>();
        q.add(new Node(targetOne,0));
        check[targetOne] = true;

        while (!q.isEmpty()){
            Node node = q.poll();
            if(targetSecond == node.x){
                return node.cnt;
            }
            for (int i = 0; i < check.length; i++) {
                if(!check[i] && arr[node.x][i] == 1){
                    check[i] = true;
                    q.add(new Node(i,node.cnt+1));
                }
            }
        }


        return -1;
    }

    static class Node {
        int x;
        int cnt;

        public Node(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
}
