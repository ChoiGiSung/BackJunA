package com.company.leetcode;

public class palindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder=new StringBuilder().append(x).reverse();
        String str=String.valueOf(x);

        return str.equals(stringBuilder.toString())? true:false;
    }
}

