package com.company.backjun.bfs;

import java.util.Scanner;
import java.util.Stack;

public class B4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s ="";
        while (true){
            s = sc.nextLine();
            if(s.equals(".")){
                return;
            }
            Stack<String> stack = new Stack<>();
            String[] split = s.split("");
            try {
                for (String s1 : split) {
                    if(s1.equals("(")){
                        stack.add("(");
                    }else if (s1.equals("[")){
                        stack.add("[");
                    }else if (s1.equals(")")){
                        if(stack.peek().equals("(")){
                            stack.pop();
                        }else {
                            throw new Exception();
                        }
                    }else if (s1.equals("]")){
                        if(stack.peek().equals("[")){
                            stack.pop();
                        }else {
                            throw new Exception();
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("no");
                continue;
            }


            if (stack.size() != 0){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }
}
