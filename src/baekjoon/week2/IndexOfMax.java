package baekjoon.week2;

import java.util.Scanner;

public class IndexOfMax {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int index = 0;
        for (int i = 1; i < 9; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);

        scanner.close();
    }
}
