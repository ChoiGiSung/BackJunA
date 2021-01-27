package com.company.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
}

 class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = s.split(":");

        if (split[2].substring(2, 4).equals("PM")) {
            if (Integer.parseInt(split[0]) < 12)
                split[0] = Integer.toString(Integer.parseInt(split[0]) + 12);
            System.out.println("Ddd");
        } else {
            if (split[0].equals("12")) {
                split[0] = "00";
            }
        }

        for (int i = 0; i < split.length - 1; i++) {
            stringBuilder.append(split[i] + ":");
        }
        return stringBuilder.append(split[2].substring(0, 2)).toString();


    }
}
