package programmers.week2;

public class CollatzApplication {
    public static int solution(long num) {
        int answer = 0;

        while (num != 1) {
            num = (num %2 == 0) ? num / 2 : num * 3 + 1;
            answer++;

            if (answer > 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
