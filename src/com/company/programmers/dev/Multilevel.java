package com.company.programmers.dev;

import java.util.*;

public class Multilevel {
    class Solution {
        public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
            int[] answer = new int[enroll.length];
            Person master = new Person(null);

            Map<String, Person> multiLevel = new HashMap();
            multiLevel.put("-", master);

            for (int i = 0; i < enroll.length; i++) {
                String name = enroll[i];
                String masterName = referral[i];

                multiLevel.put(name, new Person(multiLevel.get(masterName)));
            }

            for (int i = 0; i < seller.length; i++) {
                String sellerName = seller[i];
                Person getSeller = multiLevel.get(sellerName);
                getSeller.sell(amount[i]);
            }


            for (int i = 0; i < answer.length; i++) {
                Person person = multiLevel.get(enroll[i]);
                answer[i] = person.getMoney();
            }
            return answer;
        }

        class Person {
            Person master;

            int money;

            public Person(Person master) {
                this.master = master;
            }

            public void sell(int amount) {
                int totalMoney = amount * 100;

                if(calcTax(totalMoney) < 1){
                    plusMoney(totalMoney);
                    return;
                }

                tributeMoney(totalMoney);
            }

            public void plusMoney(int money){
                this.money += money;
            }

            public void tributeMoney(int money) {
                int tax = calcTax(money);
                int realSellMoney = money - calcTax(money);

                if(!Objects.isNull(master)){
                    master.tributeMoney(tax);
                }
                this.money += realSellMoney;
            }

            public int calcTax(int money){
                return money / 10;
            }

            public int getMoney() {
                return money;
            }
        }

    }
}
