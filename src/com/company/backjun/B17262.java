package com.company.backjun;

import java.util.*;
import java.util.stream.Stream;

public class B17262 {
    public static void main(String[] args) {

        int sum
                = Stream.of("1","2")
                .mapToInt(Integer::parseInt)
                .sum();


        System.out.println(sum);
    }
}
