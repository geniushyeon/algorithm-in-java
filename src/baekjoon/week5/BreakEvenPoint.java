package baekjoon.week5;

import java.util.Scanner;

public class BreakEvenPoint {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    long a = scanner.nextInt(); // 고정 비용
    long b = scanner.nextInt(); // 가변 비용
    long c = scanner.nextInt(); // 상품 가격

    scanner.close();

    if (c <= b) {
      System.out.println("-1");
    } else {
      System.out.println((a / (c - b)) + 1);
    }

  }
}