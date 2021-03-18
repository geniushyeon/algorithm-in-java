package programmers.week2;

public class EvenOddApplication {
    public String solution(int num) {
        String answer = "";

        if (num %2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;

        // 삼항 연산자
        // return num %2 == 0 ? "Even" : "Odd";
    }
}
