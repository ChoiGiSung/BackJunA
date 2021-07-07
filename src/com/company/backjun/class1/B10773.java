package com.company.backjun.class1;

import java.util.Scanner;
import java.util.Stack;

public class B10773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < all; i++) {
            int input = sc.nextInt();

            if(input != 0){
                st.add(input);
            }else {
             st.pop();
            }
        }

        int result = 0;

        while (!st.isEmpty()){
            result+=st.pop();
        }

        System.out.println(result);
    }
}
