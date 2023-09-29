package programmers.week12;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */
public class StringBasic {

    public boolean solution(String s) {
        if (s.isEmpty()) {
            return false;
        }

        if (s.length() > 8) {
            return false;
        }

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        try {
            Integer i = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean solutionWithRegEx(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("(^[0-9]*$)");
        }

        return false;
    }
}
