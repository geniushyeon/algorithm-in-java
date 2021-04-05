package baekjoon.week3;

import java.util.Scanner;
// 2675
public class RepeatString {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();
            char[] chars = s.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(chars[j]);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
