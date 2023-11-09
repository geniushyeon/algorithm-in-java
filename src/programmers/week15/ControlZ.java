package programmers.week15;

import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */
public class ControlZ {

    public static void main(String[] args) {
        int answer = new ControlZ().solution("10 Z 20 Z 1");

        System.out.println(answer);
    }

    public int solution(String s) {
        int answer = 0;
        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++) {
            try {
                answer += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                answer -= Integer.parseInt(array[i - 1]);
            }
        }

        return answer;
    }

    public int solutionWithStack(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String word : s.split(" ")) {
            if (word.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(word));
            }
        }

        for (int i : stack) {
            answer += i;
        }

        return answer;
    }
}
