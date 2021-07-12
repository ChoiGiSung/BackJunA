package com.company.backjun.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B10814 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        List<Node> ar = new ArrayList<>();

        int all = sc.nextInt();
        for (int i = 0; i <all; i++) {
            ar.add(new Node(sc.nextInt(),sc.next()));
        }

        Collections.sort(ar);

        for (Node node : ar) {
            System.out.println(node.getAge()+" "+node.getName());
        }
    }

    public static class Node implements Comparable<Node>{
        int age;
        String name;

        public Node(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Node o) {
            if(o.age == this.age){
                return 0;
            }

            return this.age - o.age;
        }
    }
}
