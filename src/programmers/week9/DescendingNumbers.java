package programmers.week9;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * 2023.09.04
 */
public class DescendingNumbers {

    public static void main(String[] args) {
        DescendingNumbers solution = new DescendingNumbers();
        System.out.println("solution.countingSort() = " + solution.countingSort(118372));
    }

    public long mySolution(long n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return Long.parseLong(sb.toString());
    }

    /**
     * 버블 정렬을 이용한 풀이
     * O(n^2)
     */
    public long bubbleSort(long n) {
        char[] chars = Long.toString(n).toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[j] < chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        return Long.parseLong(new String(chars));
    }

    /**
     * 계수 정렬을 이용한 풀이
     * O(n)
     */
    public Long countingSort(long n) {
        char[] chars = Long.toString(n).toCharArray();
        int[] counts = new int[10];

        for (char c : chars) {
            counts[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (counts[i]-- > 0) {
                sb.append(i);
            }
        }

        return Long.parseLong(sb.toString());
    }
}
