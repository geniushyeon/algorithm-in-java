package baekjoon.week2;

import java.util.Scanner;

public class CountOfInteger {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int num = a * b * c;
        char[] cArray = String.valueOf(num).toCharArray();
        int[] numArray = new int[cArray.length];

        for (int i = 0; i < cArray.length; i++) {
            numArray[i] = Integer.parseInt(String.valueOf(cArray[i]));
        }
        int[] array = new int[10]; // 숫자 개수 담는 배열

        for (int i = 0; i < numArray.length; i++) { // num 길이만큼 돌기
            for (int j = 0; j < array.length; j++) {
                if (numArray[i] == j) {
                    array[j] = ++array[j];
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
        scanner.close();
    }
}
