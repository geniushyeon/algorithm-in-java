package programmers.week11;

import java.util.Arrays;

public class DuplicatedNumbers {

    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(number -> number == n)
                .count();
    }

    public int anotherSolution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }

        return answer;
    }
}
