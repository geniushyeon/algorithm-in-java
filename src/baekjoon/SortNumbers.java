package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2750
 */
public class SortNumbers {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		int[] array = new int[scanner.nextInt()];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);

		for (int i : array) {
			System.out.println(i);
		}
	}
}
