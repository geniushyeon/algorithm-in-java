package baekjoon.week2;

import java.util.Scanner;
// 10952번
public class SumOfABbyWhile {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a == 0 && b == 0)
                break;
            System.out.println(a + b);
        }

        scanner.close();
    }

}
