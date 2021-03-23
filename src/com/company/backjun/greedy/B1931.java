package com.company.backjun.greedy;


import java.util.*;
import java.util.stream.Collector;

public class B1931 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int allNum=sc.nextInt();
        List<Semena> moim=new ArrayList<>();

        for (int i = 0; i <allNum; i++) {
            int start=sc.nextInt();
            int end=sc.nextInt();
            moim.add(new Semena(start,end));
        }

        Collections.sort(moim);



        //정렬은 했으니 이제 돌면서 확인하자
        int count=1;
        int nowTime=moim.get(0).endtTime;
        for (int i = 1; i < moim.size(); i++) {
            if(moim.get(i).startTime >=nowTime){
                count++;
                nowTime=moim.get(i).endtTime;
            }

        }

        Collections.sort(moim, new Comparator<Semena>() {
            @Override
            public int compare(Semena o1, Semena o2) {
                return 0;
            }
        });

        for (Semena semena : moim) {
            System.out.println(semena.endtTime);
        }

    }

    static class Semena implements Comparable<Semena>{
        int startTime;
        int endtTime;

        public Semena(int startTime, int endtTime) {
            this.startTime = startTime;
            this.endtTime = endtTime;
        }

        @Override
        public int compareTo(Semena o) {
            return 0;
        }
    }
}
