package baekjoon.week1;

import java.util.Scanner;

public class NumLessThanX {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i : array) {
            if (i < x) {
                System.out.print(i + " ");
            }
        }
    }
}
