package baekjoon.week4;

import java.util.Scanner;

// 1157
public class MostUsedAlphabet {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    String input = scanner.next().toUpperCase();
    int[] countArray = new int[26];

    int max = -1;
    char result = '?';

    for (int i = 0; i < input.length(); i++) {
      countArray[input.charAt(i) - 65]++;
      if (max < countArray[input.charAt(i) - 65]) {
        max = countArray[input.charAt(i) - 65];
        result = input.charAt(i);
      } else if (max == countArray[input.charAt(i) - 65]) {
        result = '?';
      }
    }
    System.out.println(result);
    scanner.close();
  }
}