package programmers.week11;

import java.util.Arrays;

public class MakeMax {

    public static void main(String[] args) {
        MakeMax makeMax = new MakeMax();
        System.out.println(makeMax.solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
