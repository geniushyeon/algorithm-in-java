package programmers.week3;

import java.util.HashMap;
import java.util.Map;

public class HashBasic {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> result = new HashMap<>();

        for (String player : participant) {
            int count = 0;
            Integer value = result.get(player);

            if (value != null) {
                count = value;
            }

            result.put(player, ++count);
        }

        for (String player : completion) {
            int count = result.get(player);

            if (count == 1) {
                result.remove(player);
            } else {
                result.put(player, --count);
            }
        }

        answer = result.keySet().iterator().next();

        return answer;
    }

    public static void main(String[] args) {
        HashBasic hb = new HashBasic();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        System.out.println(hb.solution(participant, completion));

    }
}
