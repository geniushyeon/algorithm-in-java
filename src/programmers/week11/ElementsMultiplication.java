package programmers.week11;

import java.util.Arrays;

public class ElementsMultiplication {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map(number -> number * 2)
                .toArray();
    }
}
