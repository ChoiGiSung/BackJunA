package com.company.backjun.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B13301 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();

        List<Long> dp = new ArrayList<>();

        dp.add(4L);
        dp.add(6L);

        for (int i = 2; i <= all; i++) {
            dp.add(dp.get(i-1)+dp.get(i-2));
        }
        System.out.println(dp.get(all-1));
    }
}
