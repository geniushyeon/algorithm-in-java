package baekjoon.week1;

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("---------");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
