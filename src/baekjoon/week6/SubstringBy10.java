package baekjoon.week6;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11721
 */
public class SubstringBy10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for (int i = 0; i <= s.length() - s.length() % 10; i += 10) {
            int j = i + 10 > s.length() ? i + s.length() % 10 : i + 10;

            System.out.println(s.substring(i, j));
        }

        scanner.close();

        // better solution
        for (int i = 0; i < s.length(); i += 10) {
            System.out.println(s.substring(i, Math.min(i + 10, s.length())));
        }
    }
}
