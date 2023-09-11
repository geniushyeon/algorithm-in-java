package programmers.week10;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class AdditionNumbers {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
        }

        return answer;
    }

    public int anotherSolution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }
}
