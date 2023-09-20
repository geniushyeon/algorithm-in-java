package programmers.week11;

import java.util.stream.IntStream;

public class HateOdds {

    public static void main(String[] args) {

    }

    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 1)
                .toArray();
    }
}
