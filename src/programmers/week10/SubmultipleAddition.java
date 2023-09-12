package programmers.week10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */
public class SubmultipleAddition {

    public int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            int number = getSubmultipleCount(i) % 2 == 0 ? i : -i;
            sum += number;
        }

        return sum;
    }

    private int getSubmultipleCount(int number) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                answer++;
            }
        }

        return answer;
    }

    public int anotherSolution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }
}
