package baekjoon.week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// 3052번. 나머지
public class ReminderArray {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt() % 42;
            integerSet.add(array[i]);
        }

        int num = integerSet.size();

        System.out.println(num);

        scanner.close();
    }
}
