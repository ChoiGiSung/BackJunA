package com.company.programmers;

public class NeaJuk {

    public static void main(String[] args) {

    }
}


class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;

        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }


        return result;
    }
}