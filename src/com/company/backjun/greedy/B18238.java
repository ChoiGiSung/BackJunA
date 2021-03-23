package com.company.backjun.greedy;

import java.util.Scanner;
import java.util.*;
public class B18238 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] getAlpha = sc.nextLine().toCharArray();
        int count = 0;
        char nowAlpha ='A';

        for (char c : getAlpha) {
            char nextAlpha = c;
            int left = nowAlpha - nextAlpha;
            if(left < 0) {left+=26;}

            int right = nextAlpha - nowAlpha;
            if(right < 0) {right+=26;}

            count += left > right ? right : left;

            nowAlpha = nextAlpha;

            //왼쪽으로 갔을 때와
            //오른쪽으로 갔을 때
            //2개를 구하고 둘 중 최솟값을 택해서 count에 더한다.
        }
        System.out.println(count);
    }
}
