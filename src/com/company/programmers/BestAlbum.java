package com.company.programmers;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args) {
    }

     class Solution {
        public int[] solution(String[] genres, int[] plays) {

            Map<String,List<Node>> map = new HashMap<>();
            List<List<Node>>arar = new ArrayList<>();

            for (int i = 0; i < genres.length; i++) {
                if(map.get(genres[i])== null){
                    map.put(genres[i],new ArrayList<>(Arrays.asList(new Node(i,plays[i]))));
                }else {
                    map.get(genres[i]).add(new Node(i,plays[i]));
                }
            }

            for (String s : map.keySet()) {
                arar.add(map.get(s));
            }

            arar.sort((o1, o2) -> {
                int asInt1 = o1.stream().mapToInt(value -> value.getNum())
                        .reduce((node, node2) -> node + node2).getAsInt();
                int asInt = o2.stream().mapToInt(value -> value.getNum())
                        .reduce((node, node2) -> node + node2).getAsInt();
                return asInt - asInt1;
            });

            List<Integer> result = new ArrayList<>();


            for (List<Node> nodes : arar) {
                Collections.sort(nodes);
                try {
                    for (int i = 0; i < 2; i++) {
                        result.add(nodes.get(i).getName());
                    }
                }catch (Exception e){

                }
            }

            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            return answer;
        }




        public  class Node implements Comparable<Node>{
            int name;
            int num;

            public Node(int name, int num) {
                this.name = name;
                this.num = num;
            }

            public int getName() {
                return name;
            }

            public int getNum() {
                return num;
            }

            @Override
            public int compareTo(Node o) {

                if(o.getNum() == this.num){
                    return this.name - o.name;
                }
                return o.num - this.num;
            }
        }
    }
}
