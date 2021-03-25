package baekjoon.week1;

public class SumOf1toNum {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
