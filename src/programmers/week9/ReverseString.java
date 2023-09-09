package programmers.week9;

public class ReverseString {

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (int i = myString.length() - 1; i >= 0; i--) {
            answer.append(myString.toCharArray()[i]);
        }

        return answer.toString();
    }

    public String anotherSolution(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        sb.reverse();

        return sb.toString();
    }
}
