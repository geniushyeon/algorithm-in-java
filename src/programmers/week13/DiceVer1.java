package programmers.week13;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181839?language=java
 */
public class DiceVer1 {

    public int solution(int a, int b) {
        if (isOdd(a) && isOdd(b)) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        } else if (isOdd(a) || isOdd(b)) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }

    public boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
