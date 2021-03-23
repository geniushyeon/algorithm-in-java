package baekjoon.week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
