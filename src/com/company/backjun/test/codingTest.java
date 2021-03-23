package com.company.backjun.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class codingTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int all = sc.nextInt();
        sc.nextLine();
        List<Time> start =new ArrayList<>();
        List<Time> end =new ArrayList<>();

        for (int i = 0; i < all; i++) {
            String[] getTime = getDetail(sc.nextLine(), "~");
            String[] getDetailStartTime = getDetail(getTime[0], ":");
            String[] getDetailEndTime = getDetail(getTime[1], ":");

            start.add(new Time(getDetailStartTime[0],getDetailStartTime[1]));
            end.add(new Time(getDetailEndTime[0],getDetailEndTime[1]));
        }

        start.sort((o1, o2) -> {
            if (o1.hor == o2.hor) {
                return  o2.min-o1.min;
            }
            return o2.hor-o1.hor;
        });

        end.sort((o1, o2) -> {
            if (o1.hor == o2.hor) {
                return o1.min - o2.min;
            }
            return o1.hor - o2.hor;
        });

        if(end.get(0).hor - start.get(0).hor <= 0){
            if(end.get(0).min - start.get(0).min <= 0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(getTimeFormat(start.get(0).hor) + ":" + getTimeFormat(start.get(0).min)
        +" ~ "+getTimeFormat(end.get(0).hor) + ":" +getTimeFormat(end.get(0).min));

    }

    private static String getTimeFormat(int intTemplate) {
        return String.format("%02d", intTemplate);
    }

    private static String[] getDetail(String s, String s2) {
        return s.split(s2);
    }

    public static class Time{
        int hor;
        int min;

        public Time(String hor, String min) {
            this.hor = Integer.parseInt(hor.trim());
            this.min = Integer.parseInt(min.trim());
        }
    }
}
