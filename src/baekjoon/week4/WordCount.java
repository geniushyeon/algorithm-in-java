package baekjoon.week4;

import java.util.*;

public class WordCount {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    StringTokenizer st = new StringTokenizer(input, " ");
    System.out.println(st.countTokens());
    scanner.close();
  }
}
