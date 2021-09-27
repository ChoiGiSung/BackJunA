package com.company.programmers.week;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Week7 {

    @Test
    void sample() {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 3, 4});
        for (int i : solution1) {
            System.out.println(i);
        }
    }


    class Solution {

        public int[] solution(int[] enter, int[] leave) {
            int[] answer = new int[enter.length];

            List<Number> insert = new ArrayList<>();
            Queue<Number> delete = new LinkedList<>();
            for (Integer integer : leave) {
                delete.add(new Number(integer, 0));
            }


            for (int i = 0; i < enter.length; i++) {
                if (insert.size() == 0) {
                    insert.add(new Number(enter[i], insert.size()));
                } else {
                    insert.forEach(Number::plus);
                    insert.add(new Number(enter[i], insert.size() ));
                }

                // 만났던 만큼 might를 + 해야함
                // insert마다 ++는 처음만 올라감
                // 마지막에 들어온 애도 앞에 들어온 애들과 might가 같아야 함

                int result = 0;
                int count = 0;
                while (insert.size() != 0 && chekHaveNumber(insert, delete.peek())) {
                    int index = insert.indexOf(delete.poll());
                    Number pop = insert.get(index);
                    insert.remove(index);
                    if (count != 0) {
                        answer[pop.getIndex()] = pop.getMight();
                        continue;
                    }
                    answer[pop.getIndex()] = pop.getMight();
                    count++;
                }

            }

            return answer;
        }

        private boolean chekHaveNumber(List<Number> insert, Number peek) {
            return insert.contains(peek);
        }


        class Number {
            int number;
            int might;

            public Number(int number, int might) {
                this.number = number;
                this.might = might;
            }

            public void plus() {
                might++;
            }

            public int getNumber() {
                return number;
            }

            public int getIndex() {
                return number - 1;
            }

            public int getMight() {
                return might;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Number number1 = (Number) o;
                return number == number1.number;
            }

            @Override
            public int hashCode() {
                return Objects.hash(number);
            }
        }
    }
}
