package baekjoon.week1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100)/10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
