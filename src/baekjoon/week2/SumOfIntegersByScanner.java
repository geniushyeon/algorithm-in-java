package baekjoon.week2;

import java.util.Scanner;

// 11720번
public class SumOfIntegersByScanner {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();
        long sum = 0;

        scanner.close();

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }

        System.out.println(sum);

    }
}
