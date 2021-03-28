package com.company.backjun.bruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B7568 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int all = sc.nextInt();
        List<person> people =new ArrayList<>();
        for (int i = 0; i < all; i++) {
            people.add(new person(sc.nextInt(), sc.nextInt()));
        }

        int count;
        for (int i = 0; i < all; i++) {
            person getI = people.get(i);
            for (int j = 0; j < all; j++) {
                person getJ = people.get(j);
                if(getI.weight < getJ.weight && getI.height < getJ.height){
                    getI.grade++;
                }
            }
        }

        for (int i = 0; i < all; i++) {
             if (i == all-1){
                 System.out.print(people.get(i).grade);
                 return;
             }
            System.out.print(people.get(i).grade+" ");
        }
    }

    public static class person implements Comparable<person>{
        int weight;
        int height;
        int grade = 1;

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(person o) {
            if(weight > o.weight && height > o.height){
                return -1;
            }
            return 1;
        }
    }
}
