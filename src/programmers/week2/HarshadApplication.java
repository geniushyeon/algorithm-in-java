package programmers.week2;
// 하샤드 수
public class HarshadApplication {
    public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        if (a % sum != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(11));

    }
}
