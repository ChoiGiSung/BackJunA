package com.company.backjun;

import java.util.*;
public class B17262 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int AllFandom= Integer.parseInt(sc.nextLine());

        int EndStart=0;
        int StartEnd=100_001;


        for (int i = 0; i <AllFandom; i++) {
            String input1 = sc.nextLine();
            String[] split1 =input1.split(" ");

            if(Integer.parseInt(split1[0]) > EndStart){
                EndStart=Integer.parseInt(split1[0]);
            }

            if(Integer.parseInt(split1[1]) < StartEnd){
                StartEnd=Integer.parseInt(split1[1]);
            }


        }

        int result= EndStart-StartEnd;

        if(result <0){
            System.out.println(0);
            return;
        }

        System.out.println(result);

    }
}
