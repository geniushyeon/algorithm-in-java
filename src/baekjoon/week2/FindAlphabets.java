package baekjoon.week2;

import java.util.Scanner;

public class FindAlphabets {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int[] array = new int[26];

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (array[c - 'a'] == -1) { // 배열 요소가 -1인 경우에만 검사
                array[c - 'a'] = i;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
