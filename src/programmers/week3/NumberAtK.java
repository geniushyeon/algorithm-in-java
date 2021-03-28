package programmers.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAtK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 3
        int[] arr = new int[3];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] = commands[i][j];
            }
            for (int j = arr[0] - 1; j < arr[1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(arr[2] - 1);
            list.clear();
        }
        return answer;
    }

    public static void main(String[] args) {
        NumberAtK n = new NumberAtK();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        for (int i : n.solution(arr, commands)) {
            System.out.println(i);
        }
    }
}
