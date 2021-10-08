package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10817
 */
public class ThreeIntegers {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		int[] array = new int[3];

		for (int i = 0; i < 3; i++) {
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);

		System.out.println(array[1]);

		scanner.close();
	}
}
