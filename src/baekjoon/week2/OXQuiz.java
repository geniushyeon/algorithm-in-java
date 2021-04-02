package baekjoon.week2;

import java.util.Scanner;

// 8958번. OX퀴즈
public class OXQuiz {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        String[] array = new String[testcase];

        for (int i = 0; i < testcase; i++) {
            array[i] = scanner.next();
        }

        scanner.close();

        for (int i = 0; i < testcase; i++) {
            int count = 0;
            int sum = 0;

            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }

            System.out.println(sum);
        }
    }
}
