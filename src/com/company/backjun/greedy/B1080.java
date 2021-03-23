package com.company.backjun.greedy;


import java.util.Arrays;
import java.util.Scanner;

public class B1080 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[][] arr1=new int[N][M];
        int[][] arr2=new int[N][M];

        getIntArr(sc, N, M, arr1);
        getIntArr(sc, N, M, arr2);
        //값 입력 완료
        int count=0;

        if(N < 3 || M <3){
            if(Arrays.deepEquals(arr1,arr2)){
                count=0;
            }else {
                count=-1;
            }
            System.out.println(count);
            return;
        }


        for (int i = 0; i < arr1.length-2; i++) {
            for (int j = 0; j < arr1[0].length-2; j++) {
                if(Arrays.deepEquals(arr1,arr2)){
                    break;
                }
                if(CheckThree(arr1,arr2,i,j)){
                    arr1[i][j]=change(arr1[i][j]);
                    arr1[i][j+1]=change(arr1[i][j+1]);
                    arr1[i][j+2]=change(arr1[i][j+2]);

                    arr1[i+1][j]=change(arr1[i+1][j]);
                    arr1[i+1][j+1]=change(arr1[i+1][j+1]);
                    arr1[i+1][j+2]=change(arr1[i+1][j+2]);

                    arr1[i+2][j]=change(arr1[i+2][j]);
                    arr1[i+2][j+1]=change(arr1[i+2][j+1]);
                    arr1[i+2][j+2]=change(arr1[i+2][j+2]);
                    count++;
                }

                if (Arrays.deepEquals(arr1,arr2)){
                    break;
                }

            }

        }
        if (!Arrays.deepEquals(arr1,arr2)){
            count=-1;
        }

        System.out.println(count);

    }
    private static boolean CheckThree(int[][] arr1, int[][] arr2,int i,int j) {
        if(arr1[i][j] != arr2[i][j]){
            return true;
        }
        return false;
    }

    private static void getIntArr(Scanner sc, int n, int m, int[][] arr2) {
        for (int i = 0; i < n; i++) {
            String getInt=sc.nextLine();
            char[] chars = getInt.toCharArray();
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Character.getNumericValue(chars[j]);
            }
        }
    }

    public static int change(int byteInteger){
        return byteInteger == 0 ? 1 : 0 ;
    }
}
