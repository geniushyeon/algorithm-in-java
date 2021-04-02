package baekjoon.week2;

import java.util.Scanner;
// 4344
public class OverTheAverage {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();

        for (int i = 0; i < testcase; i++) {
            int n = scanner.nextInt();
            int[] scores = new int[n];

            for (int j = 0; j < n; j++) {
                scores[j] = scanner.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += scores[j];
            }

            int avg = sum / n;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (scores[j] > avg) {
                    cnt++;
                }
            }
            double avgOfStudents = (double) cnt / n * 100;
            double ratio = Math.round(avgOfStudents * 1000) / 1000.0;
            System.out.printf("%.3f%%\n", ratio);
        }
        scanner.close();
    }
}
