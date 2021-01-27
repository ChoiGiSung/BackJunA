package com.company.HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n=arr.size(); // n크기의 정사각형
        int sumLeft=0;
        int sumRight=0;
        for (int i = 0; i <n; i++) {
            sumLeft+=arr.get(i).get(i);
            sumRight+=arr.get(i).get(n-(i+1));
        }

        return Math.abs(sumLeft-sumRight);

    }

}
