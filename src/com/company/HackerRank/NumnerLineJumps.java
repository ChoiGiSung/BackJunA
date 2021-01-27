package com.company.HackerRank;

public class NumnerLineJumps {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        while (true){
            if(v2>=v1)
                return "NO";
            x1+=v1;
            x2+=v2;
            if(x1==x2)
                return "YES";

            if(x1>x2)
                return "NO";
        }
    }

}
