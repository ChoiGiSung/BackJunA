package com.company.backjun;

import java.util.*;

import static java.util.Comparator.*;

public class B1202 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int allDia = sc.nextInt();
        int allBag = sc.nextInt();
        Queue<Dia> everyBag = new PriorityQueue<>();

        Dia[] allDiaList =new Dia[allDia];
        List<Long> allBagList =new ArrayList<>();

        for (int i = 0; i < allDia; i++) {
            allDiaList[i] =(new Dia(sc.nextInt(),sc.nextInt()));
        }
        for (int i = 0; i <allBag; i++) {
            allBagList.add(sc.nextLong());
        }

        Arrays.sort(allDiaList,comparingInt(o -> (int) o.weight));
        Collections.sort(allBagList);

        Long count = 0L;
        int idx=0;
        for (int i = 0; i < allBag; i++) {


            long bagWeight = allBagList.get(i);
            try {
                while (idx < allDia &&allDiaList[idx].weight <= bagWeight){
                    everyBag.add(allDiaList[idx]);
                    idx++;
                }
            }catch (IndexOutOfBoundsException e){

            }

            if(everyBag.peek() != null){
                count += everyBag.poll().price;
            }

        }

        System.out.println(count);

    }

    public static class Dia implements Comparable<Dia>{
        long weight;
        long price;

        public Dia(long weight, long price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Dia o) {
            return (int) (o.price -price);
        }
    }
}
