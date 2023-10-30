package programmers.week14;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
public class MemoryScore {

    public static void main(String[] args) {

    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int result = 0;

            for (String personName : photo[i]) {
                result += map.getOrDefault(personName, 0);
            }

            answer[i] = result;
        }

        return answer;
    }
}
