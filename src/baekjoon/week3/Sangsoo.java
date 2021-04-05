package baekjoon.week3;

import java.util.Scanner;

// 2908
public class Sangsoo {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        char[] xArray = String.valueOf(x).toCharArray();
        char[] yArray = String.valueOf(y).toCharArray();
        String xString = "";
        String yString = "";

        for (int i = 0; i < xArray.length / 2; i++) {
            char temp = xArray[i];
            xArray[i] = xArray[xArray.length - i - 1];
            xArray[xArray.length - i - 1] = temp;

            temp = yArray[i];
            yArray[i] = yArray[yArray.length - i - 1];
            yArray[yArray.length - i - 1] = temp;
        }

        for (int i = 0; i < xArray.length; i++) {
            xString += xArray[i];
            yString += yArray[i];
        }

        x = Integer.parseInt(xString);
        y = Integer.parseInt(yString);

        System.out.print(Math.max(x, y));

        scanner.close();
    }
}
