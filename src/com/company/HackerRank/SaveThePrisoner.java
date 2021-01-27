package com.company.HackerRank;

public class SaveThePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {

        int index = (m + s -1) % n ;
        if(index == 0)
            return n;
        else
            return index;


    }
}
