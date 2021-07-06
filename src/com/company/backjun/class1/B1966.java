package com.company.backjun.class1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1966 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> queue = new LinkedList<>();

        int all = sc.nextInt();
        for (int i = 0; i < all; i++) {
            queue.clear();
            int localAll = sc.nextInt();
            int index = sc.nextInt();
            for (int j = 0; j < localAll; j++) {
                if (j == index) {
                    queue.add(new Node(sc.nextInt(), true));
                } else {
                    queue.add(new Node(sc.nextInt(), false));
                }
            }


            int count = 1;

            while (!queue.isEmpty()) {
                Node peek = queue.peek();
                boolean flag = true;

                for (Node node : queue) {
                    if(peek.getNumber() < node.getNumber()){
                        Node poll = queue.poll();
                        queue.add(poll);
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    if(peek.isOrder()){
                        queue.poll();
                        System.out.println(count);
                        break;
                    }else {
                        queue.poll();
                        count++;
                    }
                }
            }




        }




    }

    static class Node {
        int number;
        boolean order;

        public Node(int number, boolean order) {
            this.number = number;
            this.order = order;
        }

        public int getNumber() {
            return number;
        }

        public boolean isOrder() {
            return order;
        }
    }
}
