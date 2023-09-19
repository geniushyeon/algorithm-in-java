package programmers.week11;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class LoopCharacter {

    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }

        return sb.toString();
    }
}
