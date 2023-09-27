package programmers.week12;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
public class HallOfFame {

    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        int[] solution = hallOfFame.solutionUsingQueue(3, new int[]{10, 100, 20, 150, 1, 100, 200});

        for (int s : solution) {
            System.out.println(s);
        }
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hallOfFame.add(score[i]);
            } else {
                if (score[i] > hallOfFame.get(0)) {
                    hallOfFame.remove(0);
                    hallOfFame.add(score[i]);
                }
            }

            Collections.sort(hallOfFame);
            answer[i] = hallOfFame.get(0);
        }

        return answer;
    }

    public int[] solutionUsingQueue(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            answer[i] = hallOfFame.peek();
        }

        return answer;
    }
}
