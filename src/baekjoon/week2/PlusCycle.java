package baekjoon.week2;

import java.util.Scanner;
// 1110번 : 더하기 사이클
public class PlusCycle {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 10) {
            n *= 10;
        }

        int count = 0;
        int temp = n;
        scanner.close();
        while (true) {
            int i = n%10;
            n = (n/10) + (n%10);
            n = (i*10) + (n%10);
            count++;
            if (n == temp)
                break;

        }
        System.out.println(count);
    }
}
