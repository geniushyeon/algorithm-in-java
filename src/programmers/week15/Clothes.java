package programmers.week15;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Clothes {

    public static void main(String[] args) {
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(new Clothes().solution(clothes));
    }
    public int solution(String[][] clothes) {
        int answer = 1;

        // key: 종류, values: 의상으로 저장
        Map<String, Integer> clothesMap = new HashMap<>();

        for (String[] clothe : clothes) {
            String type = clothe[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }

        for (String key : clothesMap.keySet()) {
            answer *= clothesMap.get(key) + 1;
        }

        // 전부 안 입는 경우의 수는 없으므로 1을 빼줌
        return answer - 1;
    }
}
