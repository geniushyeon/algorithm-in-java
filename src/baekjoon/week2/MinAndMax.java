package baekjoon.week2;

import java.util.Scanner;
// 10818번
public class MinAndMax {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            min = array[0];
            max = array[0];
        }

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        scanner.close();
        System.out.println(min + " " + max);
    }
}
