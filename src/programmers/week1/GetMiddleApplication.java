package programmers.week1;

public class GetMiddleApplication {
    public String solution(String s) {
        String answer = "";

        char[] array = s.toCharArray();
        if (array.length %2 == 0) {
            answer += array[array.length / 2 - 1];
        }
        answer += array[array.length / 2];

        return answer;
    }

    public String answer(String s) {
        String answer = "";

        answer = s.substring((s.length()-1) / 2, s.length()/2 + 1);

        return answer;
    }
}
