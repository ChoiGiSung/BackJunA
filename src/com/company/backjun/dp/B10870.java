package com.company.backjun.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B10870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();

        List<Integer> dp = new ArrayList<>();

        dp.add(0);
        dp.add(1);

        for (int i = 2; i <= all; i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2));
        }
        System.out.println(dp.get(all));
    }
}
