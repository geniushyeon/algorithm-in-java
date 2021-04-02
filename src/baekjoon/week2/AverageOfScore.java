package baekjoon.week2;

import java.util.Scanner;

// 1546번. 평균
public class AverageOfScore {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] array = new double[n];
        double max = array[0];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
            if (array[i] > max) {
                max = array[i];
            }

        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = array[i] / max * 100;
            sum += array[i];
        }

        sum /= n;
        System.out.println(sum);

        scanner.close();
    }
}
