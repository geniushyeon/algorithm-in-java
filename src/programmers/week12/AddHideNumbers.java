package programmers.week12;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class AddHideNumbers {

    public static void main(String[] args) {
        AddHideNumbers addHideNumbers = new AddHideNumbers();
        System.out.println(addHideNumbers.anotherSolution("aAb1B2cC34oOp"));
    }

    public int solution(String my_string) {
        int answer = 0;

        for (char c : my_string.toCharArray()) {
            if (String.valueOf(c).matches("(^[0-9]*$)")) {
                answer += Integer.parseInt(String.valueOf(c));
            }
        }

        return answer;
    }

    public int anotherSolution(String my_string) {
        int answer = 0;

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += Integer.parseInt(String.valueOf(c));
            }
        }

        return answer;
    }
}
