package baekjoon.week1;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m < 45 && h == 0) {
            h = 23;
            m = m + 60 - 45;
        } else if (m >= 45) {
            m -= 45;
        } else {
            h -= 1;
            m = m + 60 - 45;
        }

        System.out.println(h + " " + m);
    }
}
