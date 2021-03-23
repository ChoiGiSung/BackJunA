package com.company.backjun.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class B11000 {

    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int all = sc.nextInt();
        Time[] allTime=new Time[all];
        for (int i = 0; i <all; i++) {
            allTime[i] = new Time(sc.nextInt(),sc.nextInt());
        }
        Queue<Integer> pq=new PriorityQueue<>();

        Arrays.sort(allTime);
        for (int i = 0; i < allTime.length; i++) {

            if(pq.peek() == null || pq.peek() <= allTime[i].getStart()){
                pq.poll();
                pq.add(allTime[i].getEnd());
                continue;
            }else {
                pq.add(allTime[i].end);
            }
        }

        System.out.println(pq.size());


    }

    public static class Time implements Comparable<Time>{
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public int compareTo(Time o) {
            if(start == o.start){
                return end - o.end;
            }
            return start - o.start;
        }
    }

}
