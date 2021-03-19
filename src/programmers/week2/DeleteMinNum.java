package programmers.week2;

import java.util.ArrayList;
import java.util.List;
// 제일 작은 수 제거하기
public class DeleteMinNum {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                list.remove(i);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));
    }
}
