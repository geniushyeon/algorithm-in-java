package programmers.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 제일 작은 수 제거하기
public class DeleteMinNum {
    public static int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[] {-1};
        }

        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i)) {
                list.remove(i);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
