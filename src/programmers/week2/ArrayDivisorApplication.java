package programmers.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDivisorApplication {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        boolean divisible = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
                divisible = true;
            }
        }

        if (divisible == false) {
            list.add(0, -1);
        }

        Collections.sort(list);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
