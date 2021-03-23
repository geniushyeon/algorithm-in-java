package programmers.week3;

import java.util.Arrays;

public class IntegerDesc {
    public long solution(long n) {
        long answer = 0;

        String arr[] = String.valueOf(n).split("");

        Arrays.sort(arr);

        String str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            str += arr[i];
        }

        answer = Integer.parseInt(str);

        return answer;
    }

    public static void main(String[] args) {
        IntegerDesc integerDesc = new IntegerDesc();

        System.out.println(integerDesc.solution(118372));
    }
}
