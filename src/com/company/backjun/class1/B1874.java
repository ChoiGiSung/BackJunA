package com.company.backjun.class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class B1874 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int[] ar = new int[all];
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i = 0; i<ar.length;i++){
            ar[i] = sc.nextInt();
        }

        for (int i = 1; i <= ar.length; i++) {
            stack.add(i);
            result.add("+");
            while (!stack.isEmpty()){
                if(stack.peek() == ar[index]){
                    stack.pop();
                    index++;
                    result.add("-");
                }else {
                    break;
                }
            }
        }

        if(!stack.isEmpty()){
            System.out.println("NO");
        }else {
            for (String s : result) {
                System.out.println(s);
            }
        }


    }
}
