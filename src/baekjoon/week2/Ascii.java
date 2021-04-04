package baekjoon.week2;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);
        int num = (int) c;

        System.out.print(num);

        scanner.close();
    }
}
