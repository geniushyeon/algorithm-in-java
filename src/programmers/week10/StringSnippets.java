package programmers.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class StringSnippets {

    public static void main(String[] args) {
        StringSnippets stringSnippets = new StringSnippets();
        System.out.println("stringSnippets.solution(\"3141592\", \"271\") = " + stringSnippets.solution("3141592", "271"));
    }

    public int solution(String t, String p) {
        long number = Long.parseLong(p);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i <= t.length() - p.length(); i++) {
            strings.add(t.substring(i, i + p.length()));

        }

        List<Long> numbers = strings.stream()
                .map(Long::parseLong)
                .collect(Collectors.toList());

        return (int) numbers.stream()
                .filter(n -> n <= number)
                .count();
    }
}
