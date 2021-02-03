package com.company.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class NumMax {

    class Solution {
        public long solution(String expression) {

            ArrayList<Long> onlyNum = getOnlyNum(expression);
            ArrayList<String> onlOper = getOnlyOper(expression);


            return calc(onlyNum, onlOper);
        }


        public Long calc(ArrayList<Long> onlyNum, ArrayList<String> onlyOper) {
            ArrayList<Long> MaxNum = new ArrayList<>();
            String[][] oper = {
                    {"*", "+", "-"},
                    {"*", "-", "+"},
                    {"+", "*", "-"},
                    {"+", "-", "*"},
                    {"-", "+", "*"},
                    {"-", "*", "+"}
            };


            for (int i = 0; i < oper.length; i++) {
                ArrayList<Long> copyNum = (ArrayList<Long>) onlyNum.clone();
                ArrayList<String> copyOper = (ArrayList<String>) onlyOper.clone();

                for (int j = 0; j < oper[0].length; j++) {

                    while (copyOper.indexOf(oper[i][j]) != -1) {
                        int getIndex = copyOper.indexOf(oper[i][j]);

                        Long getResult = NumCalc(oper[i][j], copyNum.get(getIndex), copyNum.get(getIndex + 1));

                        copyNum.remove(getIndex + 1);
                        copyNum.remove(getIndex);
                        copyNum.add(getIndex, getResult);

                        copyOper.remove(getIndex);

                    }

                }
                MaxNum.add(Math.abs(copyNum.get(0)));
            }

            System.out.println(Collections.max(MaxNum));

            return Collections.max(MaxNum);

        }

        public Long NumCalc(String oper, Long a, Long b) {
            switch (oper) {
                case "*":
                    return a * b;

                case "+":
                    return a + b;
                case "-":
                    return a - b;
            }

            return 0L;
        }


        private ArrayList<Long> getOnlyNum(String expression) {
            ArrayList<Long> Ar = new ArrayList<>();
            String onlyNum = expression.replaceAll("[^0-9]", " ");
            String[] getNum = onlyNum.split(" ");

            for (String s : getNum) {
                Ar.add(Long.valueOf(s));
            }

            return Ar;
        }

        private ArrayList<String> getOnlyOper(String expression) {
            ArrayList<String> Ar = new ArrayList<>();
            String onlyNum = expression.replaceAll("[0-9]", "");
            String[] getNum = onlyNum.split("");

            for (String s : getNum) {
                Ar.add(s);
            }

            return Ar;
        }
    }

}


