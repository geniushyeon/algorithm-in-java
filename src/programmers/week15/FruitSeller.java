package programmers.week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
public class FruitSeller {

    public static void main(String[] args) {
        System.out.println(new FruitSeller().solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;

        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }
}
