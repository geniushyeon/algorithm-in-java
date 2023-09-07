package programmers.week9;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */
public class LambSkewers {

    public static void main(String[] args) {

    }

    public int solution(int n, int k) {
        int skewers = 12000 * n;
        int drink = 2000 * k;
        int service = (n / 10) * 2000;

        return skewers + drink - service;
    }
}
