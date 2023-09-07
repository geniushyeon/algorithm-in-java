package programmers.week9;

public class AvgOfArray {

    public static void main(String[] args) {

    }

    public double solution(int[] numbers) {
        double answer = 0;

        for (int i : numbers) {
            answer += i;
        }
        return answer / numbers.length;
    }
}
