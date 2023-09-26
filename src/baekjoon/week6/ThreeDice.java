package baekjoon.week6;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2480
 */
public class ThreeDice {

    public static void main(String[] args) {
        ThreeDice threeDice = new ThreeDice();
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        scanner.close();

        int answer = 0;

        if (x == y && y == z) {
            answer = 10000 + x * 1000;
        } else if (x == y || y == z || x == z) {
            answer = 1000 + threeDice.getSameNumber(x, y, z) * 100;
        } else {
            answer = 100 * Math.max(x, Math.max(y, z));
        }

        System.out.println(answer);
    }

    private int getSameNumber(int x, int y, int z) {
        if (x == y || x == z) {
            return x;
        }

        return y;
    }
}
