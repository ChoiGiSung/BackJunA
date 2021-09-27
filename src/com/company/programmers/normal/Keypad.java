package com.company.programmers.normal;

import java.util.HashMap;

public class Keypad {


    class Solution {
        HashMap<String,int[]> Hs=new HashMap<>();
        String L="*";
        String R="#";
        public String solution(int[] numbers, String hand) {

            String answer = "";

            Hsadd();

            StringBuilder stringBuilder=new StringBuilder();
            for (int number : numbers) {
                if(number != 0 && (number % 3 ==1 ||number % 3 ==0) ){
                    String strate = getStrate(number);
                    stringBuilder.append(strate);
                    continue;
                }

                String resultHand = getLength(L, R, number, hand);

                if (resultHand.equals("L")){
                    L=Integer.toString(number);
                }else {
                    R=Integer.toString(number);
                }

                stringBuilder.append(resultHand);
            }

            return stringBuilder.toString();
        }

        public String getStrate(int num){
            int i = num % 3;
            if(i == 1){
                L=Integer.toString(num);
                return "L";
            }else {
                R=Integer.toString(num);
                return "R";
            }
        }

        public void Hsadd(){
            Hs.put("1",new int[]{0,0});
            Hs.put("2",new int[]{0,1});
            Hs.put("3",new int[]{0,2});

            Hs.put("4",new int[]{1,0});
            Hs.put("5",new int[]{1,1});
            Hs.put("6",new int[]{1,2});

            Hs.put("7",new int[]{2,0});
            Hs.put("8",new int[]{2,1});
            Hs.put("9",new int[]{2,2});

            Hs.put("*",new int[]{3,0});
            Hs.put("0",new int[]{3,1});
            Hs.put("#",new int[]{3,2});
        }

        public String getLength(String L,String R,int num,String hand){
            int[] getL = Hs.get(L);
            int[] getR = Hs.get(R);
            int[] getNum = Hs.get(Integer.toString(num));

            double getLLength = getLengthcalc(getL, getNum);
            double getRLength = getLengthcalc(getR, getNum);

            if(getLLength == getRLength){
                if(hand.equals("left")){
                    return "L";
                } else {
                    return "R";

                }
            }

            return getLLength < getRLength ? "L":"R";

        }

        public double getLengthcalc(int[]hand,int[]Result){
            //공식의 문제 였다.
            //문제에서는 거리는 1씩 이동을 하는데 -> 맨하탄 공식
            //나는 좌표상으 직선 거리를 구하고 있었다. -> 유클리드 공식
            return Math.abs(hand[0]-Result[0])+Math.abs(hand[1]-Result[1]);
        }
    }




}
