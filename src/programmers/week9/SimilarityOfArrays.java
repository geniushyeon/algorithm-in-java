package programmers.week9;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class SimilarityOfArrays {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String a : s1) {
            for (String b : s2) {
                if (a.equals(b)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
