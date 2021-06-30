package com.company.backjun.class1;

import java.util.*;

public class B1181 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int all = sc.nextInt();
        List<Node> strings = new ArrayList<>();
        for(int i = 0; i<all;i++){
            String string = sc.next();
            if(!strings.contains(new Node(string))){
                strings.add(new Node(string));
            }

        }
        Collections.sort(strings);

        for(Node n :strings ){
            System.out.println(n.getString());
        }

    }

    static class Node implements Comparable<Node>{
        String string;

        public Node(String string){
            this.string = string;
        }

        public String getString(){
            return this.string;
        }

        @Override
        public int compareTo(Node o){
            if(this.string.length() == o.getString().length()){
                char[] chars = string.toCharArray();
                char[] charsTwo = o.getString().toCharArray();
                int countFirst = 0;
                int countSecond = 0;
                for(int i = 0; i<chars.length;i++){
                    if(chars[i]!=charsTwo[i]){
                        return chars[i] - charsTwo[i];
                    }
                }
                return 0;
            }
            return this.string.length()-o.getString().length() ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(string, node.string);
        }

        @Override
        public int hashCode() {
            return Objects.hash(string);
        }
    }
}
