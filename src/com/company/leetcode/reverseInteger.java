package com.company.leetcode;

import java.math.BigDecimal;

public class reverseInteger {

}
class Solution {
    public int reverse(int x) {
        StringBuilder stringBuilder=new StringBuilder().append(x);
        stringBuilder.reverse();
        String resultStr = stringBuilder.toString();

        if(resultStr.indexOf("-") != -1){
            resultStr=resultStr.replace("-","");
            resultStr="-"+resultStr;
        }
        long result =Long.parseLong(resultStr);
        if(result > Integer.MAX_VALUE || result<Integer.MIN_VALUE)
            return 0;

        return (int) result;
    }
}