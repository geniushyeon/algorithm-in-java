package programmers.week12;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */
public class OperationBasedOnLength {

    public int solution(int[] num_list) {
        if (num_list.length > 10) {
            return Arrays.stream(num_list)
                    .sum();
        }

        int answer = 1;

        for (int n : num_list) {
            answer *= n;
        }

        return answer;
    }

    public int solutionUsingStream(int[] num_list) {
        IntStream stream = IntStream.of(num_list);

        return num_list.length > 10 ? stream.sum() : stream.reduce(1, (a, b) -> a * b);
    }
}
