package programmers.week1;

public class AddIntegersApplication {
    public long solution(int a, int b) {
        long answer = 0;
        int num1 = 0;
        int num2 = 0;

        if (a > b) {
            num1 = b;
            num2 = a;
        } else {
            num1 = a;
            num2 = b;
        }

        if (num1 != num2) {
            for (int i = num1; i <= num2; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }

        return answer;
    }

    public int fixedSolution(int a, int b) {
        int answer = 0;

        if (a != b) {
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                answer += i;
            }
        } else {
            answer = a;
        }

        return answer;
    }
}
