package com.company.leetcode;

import java.util.ArrayList;

public class longestCommon {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0){
            return "";
        }
        ArrayList<String> Ar=new ArrayList<>();
       String str=strs[0];
        for (int i = 0; i < str.length(); i++) {
            String prefix=str.substring(0,i+1);

            for (int j = 0; j < strs.length; j++) {
                if(strs[j].startsWith(prefix)){
                    if (j == strs.length-1){
                        Ar.add(prefix); //마지막 인덱스 까지 검사가 통과하면 add
                    }
                    continue;
                }else {
                    break; //"aaa","aa","aaa" 일 때 중간에 break를 해야 다음 검사를 안한다.
                }
            }
        }
        int max=0;
        String maxStr="";
        for (String s : Ar) {
            if (max < s.length()){
                max=s.length();
                maxStr=s;
            }
        }

        return maxStr;
    }
}
