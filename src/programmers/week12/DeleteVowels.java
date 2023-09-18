package programmers.week12;

import java.util.ArrayList;
import java.util.List;

public class DeleteVowels {

    public static void main(String[] args) {
        DeleteVowels deleteVowels = new DeleteVowels();
        System.out.println(deleteVowels.solution("nice to meet you"));

    }

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (isVowel(c)) {
                continue;
            }

            answer.append(c);
        }

        return answer.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String solutionWithRegex(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
