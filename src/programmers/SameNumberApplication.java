package programmers;

import java.util.ArrayList;
import java.util.List;

/*
* 같은 숫자는 싫어
* 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
*
* */
public class SameNumberApplication {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            }
            else if (arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }

        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 3, 3};
        System.out.println(solution(arr));

    }


}
