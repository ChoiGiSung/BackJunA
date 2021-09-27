package com.company.programmers.normal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupPhoto {

    static Map<Character,Integer> list = new HashMap();

    static {
        list.put('A',0);
        list.put('C',1);
        list.put('F',2);
        list.put('J',3);
        list.put('M',4);
        list.put('N',5);
        list.put('R',6);
        list.put('T',7);
    }

    static boolean[] check;
    static int N;
    static String[] dataGlobal;
    static int[] output;
    static int sum = 0;

    class Solution {
        public int solution(int n, String[] data) {
            N = 8;
            dataGlobal = data.clone();
            check = new boolean[N];
            output = new int[N];
            dfs(0);

            return sum;
        }

        private void dfs(int depth) {
            if (depth == N) {
                checkValid(output);
                return;
            }

            for (int i = 0; i < N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    output[depth] =i;
                    dfs(depth + 1);
                    check[i] = false;
                }
            }
        }
    }

    private void checkValid(int[] output) {
        for (String rule : dataGlobal) {
            if(!checkRule(rule, output)){
                return;
            }
        }
        sum++;
    }

    private boolean checkRule(String rule, int[] output) {
        char[] chars = rule.toCharArray();
        char firstName = chars[0];
        char secondName = chars[2];
        char oper = chars[3];
        int num = chars[4] - '0';
        int first = output[list.get(firstName)];
        int second = output[list.get(secondName)];
        int condition = Math.abs(first - second) - 1;

        if (oper == '=') {
            if (condition == num) {
                return true;
            }
            return false;
        } else if (oper == '>') {
            if (condition > num) {
                return true;
            }
            return false;
        } else if (oper == '<') {
            if (condition < num) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Test
    void sample() {
        Solution solution = new Solution();
        int sum = solution.solution(2, new String[]{"N~F=0", "R~T>2"});
        System.out.println(sum);
    }
}
