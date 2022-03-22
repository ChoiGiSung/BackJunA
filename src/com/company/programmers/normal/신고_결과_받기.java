package com.company.programmers.normal;

import org.junit.jupiter.api.Test;

import java.util.*;

public class 신고_결과_받기 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] solution1 = solution.solution(
                new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2);

        for (int i : solution1) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            HashMap<String, Set<String>> result = new HashMap<>();
            HashMap<String, Integer> 신고자결과 = new HashMap<>();

            //신고자 결과 초기화
            for (String 신고자 : id_list) {
                신고자결과.put(신고자, 0);
            }

            //신고 하기
            for (int i = 0; i < report.length; i++) {
                String getFind = report[i];
                String[] splitString = getFind.split(" ");

                fillResultMap(splitString[0], splitString[1], result);
            }

            //신고자 결과 세팅
            for (Map.Entry<String, Set<String>> stringSetEntry : result.entrySet()) {
                if (stringSetEntry.getValue().size() >= k) {
                    for (String 신고자 : stringSetEntry.getValue()) {
                        신고자결과.put(신고자, 신고자결과.get(신고자) + 1);
                    }
                }
            }

            //answer 세팅
            for (int i = 0; i < id_list.length; i++) {
                String 신고자 = id_list[i];

                answer[i] = 신고자결과.get(신고자);
            }

            return answer;
        }

        private void fillResultMap(String 신고자, String 피신고자, HashMap<String, Set<String>> 봉투) {

            if (봉투.get(피신고자) == null) {
                봉투.put(피신고자, new HashSet<>(Arrays.asList(신고자)));
            } else {
                Set<String> getFindSet = 봉투.get(피신고자);
                getFindSet.add(신고자);
            }
        }
    }

}
