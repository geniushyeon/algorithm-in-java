package programmers.week9;

public class PlusEvens {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }

        return answer;
    }
}
