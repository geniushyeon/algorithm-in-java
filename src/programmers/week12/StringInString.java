package programmers.week12;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
public class StringInString {


    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        }

        return 2;
    }
}
