package baekjoon.week1;

import java.util.Scanner;

public class SumOfABDuringT {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int[] arr = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
        scanner.close();

        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < testcase; i++) {
            System.out.println("Case #" + (i+1) + ": " + arr[i]);
        }
    }
}
