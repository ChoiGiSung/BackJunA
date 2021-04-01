package com.company.backjun.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B9625 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();

        List<Long> aDp = new ArrayList<>();
        List<Long> bDp = new ArrayList<>();

        aDp.add(1L);
        aDp.add(0L);

        bDp.add(0L);
        bDp.add(1L);

        for (int i = 2; i <= all; i++) {
            aDp.add(aDp.get(i - 1) + aDp.get(i - 2));
            bDp.add(bDp.get(i - 1) + bDp.get(i - 2));
        }
        System.out.println(aDp.get(all) + " " + bDp.get(all));
    }
}
