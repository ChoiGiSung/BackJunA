package com.company.programmers.runing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test신고결과받기 {

    @Test
    void test(){
        Solution solution = new Solution();
        solution.solution(new String[][] {{"09:10", "lee"}},new String[][] {{"09:00", "kim"}, {"09:05", "bae"}});
    }

    class Solution {
        int now;
        public String[] solution(String[][] booked, String[][] unbooked) {
            String[] answer;


            int bookedTime = getTime(booked[0]);
            int unbookedTime = getTime(unbooked[0]);

            if(bookedTime > unbookedTime){
                now = unbookedTime;
            }else {
                now = bookedTime;
            }

            PriorityQueue<People> people = new PriorityQueue<>();

            for (String[] strings : booked) {
                people.add(new People(strings[0],strings[1],true));
            }

            for (String[] strings : unbooked) {
                people.add(new People(strings[0],strings[1],false));

            }
            answer = new String[people.size()];
            int index= 0;
            while (!people.isEmpty()){
                People poll = people.poll();
                answer[index] = poll.name;
                index++;
                now+=10;
                people.stream().sorted();
            }
            return answer;
        }

        private int getTime(String[] strings) {
            int time = 0;
            String string = strings[0];
            String[] split = string.split(":");
            time+=Integer.parseInt(split[0]) * 60;
            time+=Integer.parseInt(split[1]);
            return time;
        }

        class People implements Comparable<People>{
            int time;
            String name;
            boolean check;

            public People(String time, String name, boolean check) {
                String[] split = time.split(":");
                this.time+=Integer.parseInt(split[0]) * 60;
                this.time+=Integer.parseInt(split[1]);
                this.name = name;
                this.check = check;
            }

            @Override
            public int compareTo(People o) {
                if(now >= this.time && now >= o.time){
                    if(this.time < o.time){
                        if(this.check){
                            return -1;
                        }else if(o.check){
                            return 1;
                        }else {
                            return -1;
                        }
                    }else {
                        if(o.check){
                            return 1;
                        }else if(this.check){
                            return -1;
                        }else {
                            return 1;
                        }
                    }
                }else if(this.time <= now){
                    return -1;
                }else if(o.time <= now){
                    return 1;
                }
                return 0;
            }
        }
    }
}
