package com.company.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class MenuReMenu {
    class Solution {
        public String[] solution(String[] orders, int[] course) {


            Arrays.sort(orders, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.compare(o1.length(),o2.length());
                }
            });

            HashMap<String,Integer> courseMenuMap=new HashMap<>();
            Set<String> courseMenu=new HashSet<>();
            Arrays.sort(orders, Comparator.comparingInt(String::length));
            Arrays.sort(orders,(o1, o2) -> Integer.compare(o1.length(),o2.length()));


            ArrayList<String>ResultMenu=new ArrayList<>();

            for (int i = 0; i < orders.length-1; i++) {
                String[] menuSplit = orders[i].split("");

                for (int j = i+1; j < orders.length; j++) {

                    StringBuilder stringBuilder=new StringBuilder();
                    for (int k = 0; k < menuSplit.length; k++) {
                        if(orders[j].contains(menuSplit[k])){
                            stringBuilder.append(menuSplit[k]);
                        }

                    }
                    if (stringBuilder.toString().length()>=2){
                        String foodSet = stringBuilder.toString();
                        char[] foodChar = foodSet.toCharArray();
                        Arrays.sort(foodChar);

                        String newMenu = new String(foodChar);

                        if(courseMenuMap.get(newMenu) !=null){
                            courseMenuMap.put(newMenu,courseMenuMap.get(newMenu)+1);
                        }else
                            courseMenuMap.put(new String(foodChar),1);
                    }


                }

            }


            //메뉴내에 자신이 포함되어 있을 수 있다.
            for (String s : courseMenuMap.keySet()) {
                courseMenuMap.get(s);
                for (String s1 : courseMenuMap.keySet()) {
                    if(s.equals(s1)){
                        continue;
                    }
                    if(s1.contains(s)){
                        courseMenuMap.put(s,courseMenuMap.get(s)+1);
                    }
                }
            }



            //메뉴중 누가 더 많이 주문 됬는지
            for (int i : course) {
                ArrayList<String> menuName=new ArrayList();
                for (String s : courseMenuMap.keySet()) {
                    if (s.length()==i){
                        menuName.add(s);
                    }
                }

                int max=0;

                for (String s : menuName) {
                    if(max < courseMenuMap.get(s))
                        max=courseMenuMap.get(s);
                }

                for (String s : menuName) {
                    if(courseMenuMap.get(s)==max){
                        ResultMenu.add(s);
                    }
                }

            }

            Collections.sort(ResultMenu);
            String[] answer = new String [ResultMenu.size()];


            for (int i = 0; i < ResultMenu.size(); i++) {

                answer[i]=ResultMenu.get(i);
            }



            return answer;

        }
    }
}
