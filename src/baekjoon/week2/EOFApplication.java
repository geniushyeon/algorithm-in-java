package baekjoon.week2;

import java.util.Scanner;
// 10951번 - EOF
public class EOFApplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }

        scanner.close();
    }
}
