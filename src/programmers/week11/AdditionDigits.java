package programmers.week11;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */
public class AdditionDigits {
    public int solution(int n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int answer = 0;
        for (char c : charArray) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }

    public int anotherSolution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
