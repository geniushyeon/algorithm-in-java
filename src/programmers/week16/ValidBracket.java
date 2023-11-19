package programmers.week16;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class ValidBracket {

    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c != ')') {
                stack.push(c);
            } else if (stack.isEmpty() || '(' != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
