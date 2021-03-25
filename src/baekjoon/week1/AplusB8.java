package baekjoon.week1;

import java.util.*;

public class AplusB8 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        Map<String, int[]> map = new HashMap<>();

        for (int i = 0; i < testcase; i++) {
            int[] array = new int[2];
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String key = "Case #" + (i+1);
            array[0] = a;
            array[1] = b;
            map.put(key, array);
        }
        scanner.close();
        int a = 0;
        int b = 0;
        for (int i = 0; i < testcase; i++) {
            a = map.get("Case #" + (i+1))[0];
            b = map.get("Case #" + (i+1))[1];

            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) );
        }
    }
}
