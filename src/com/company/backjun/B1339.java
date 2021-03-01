package com.company.backjun;


import java.util.*;

public class B1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all=sc.nextInt();
        sc.nextLine();
        List<String> ar=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <all; i++) {
            ar.add(sc.nextLine());
        }


        for (int i = 0; i < ar.size(); i++) {
            String getStr=ar.get(i);
            char[] getChars = getStr.toCharArray();

            for (int j = 0; j < getChars.length; j++) {
                char getChar = getChars[getChars.length-j-1];
                if(map.get(getChar) != null){
                    Integer integer = map.get(getChar);
                    map.put(getChar, (int) (integer+Math.pow(10,j)));
                }else {
                    map.put(getChar,(int) (Math.pow(10,j)));
                }
            }
        }

        ArrayList<Integer> integers = new ArrayList<>(map.values());
        integers.sort((o1, o2) -> o2-o1);
        int count=0;
        int max=9;
        for (int i = 0; i < integers.size(); i++) {
            count+=integers.get(i)*max--;

        }
        System.out.println(count);


    }
}
