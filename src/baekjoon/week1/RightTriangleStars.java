package baekjoon.week1;

import java.util.Scanner;

public class RightTriangleStars {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("------------");
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i < j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }

    }
}
