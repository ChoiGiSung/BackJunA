package com.company.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TargetNum {

    Queue<Node> q = new LinkedList<>();
    int targetNum;
    int result = 0;

    class Solution {
        public int solution(int[] numbers, int target) {
            int answer = 0;
            targetNum = target;

            q.add(new Node(numbers[0], 0));
            q.add(new Node(-numbers[0], 0));

            bfs(numbers);

            return result;
        }

        private void bfs(int[] numbers) {
            while (!q.isEmpty()) {

                Node poll = q.poll();
                if (poll.index == numbers.length - 1) {
                    if (targetNum == poll.num) {
                        result++;
                    }
                    continue;
                }

                q.add(new Node(poll.num+numbers[poll.index + 1], poll.index + 1));
                q.add(new Node(poll.num-numbers[poll.index + 1], poll.index + 1));
            }

        }
    }

    class Node {
        int num;
        int index;

        public Node(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }

    @Test
    public void sample() {
        Solution solution = new Solution();

        int solution1 = solution.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(solution1);
//        Assertions.assertEquals();
    }
}
