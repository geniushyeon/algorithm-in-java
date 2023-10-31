package programmers.week14;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
public class SortStringsV2 {

    public static void main(String[] args) {
        SortStringsV2 solution = new SortStringsV2();
        String[] strings = new String[]{"abce", "abcd", "cdx"};
        String[] result = solution.solution(strings, 2);

        for (String s : result) {
            System.out.println("s = " + s);
        }
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : strings) {
            map.put(s, (int) s.charAt(n));
        }

        return sort(map).toArray(answer);
    }

    private List<String> sort(Map<String, Integer> map) {
        LinkedHashMap<String, Integer> collect = map.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int cmp = e1.getValue().compareTo(e2.getValue());
                    if (cmp != 0) return cmp;

                    return e1.getKey().compareTo(e2.getKey());
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        return new ArrayList<>(collect.keySet());
    }

    public String[] betterSolution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for (String s : strings) {
            list.add("" + s.charAt(n) + s);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
