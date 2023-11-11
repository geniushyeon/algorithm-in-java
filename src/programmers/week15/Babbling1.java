package programmers.week15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Babbling1 {

    public static void main(String[] args) {
        String[] babbling = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(new Babbling1().solution(babbling));
    }

    String[] enable = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;
        List<String> collect = Arrays.stream(babbling)
                .filter(bab -> bab.startsWith("aya") || bab.startsWith("ye") || bab.startsWith("woo") || bab.startsWith("ma"))
                .collect(Collectors.toList());

        for (String bab : collect) {
            for (String e : enable) {
                bab = bab.replace(e, "1");
            }
            if (bab.matches("[0-9]+")) {
                answer++;
            }
        }

        return answer;
    }

    public int anotherSolution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if (babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
    }

}
