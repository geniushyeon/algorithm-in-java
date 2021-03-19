package programmers.week2;
// 수박수박수박...
public class StringPattern {
    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += i %2 == 0 ? "수" : "박";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
