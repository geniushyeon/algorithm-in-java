package doit.chap01.basic;

import java.util.Arrays;

public class BasicAlgorithm {
    public int max3(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public int min3(int a, int b, int c) {
        int min = a;

        if (min > b)
            min = b;
        if (min > c)
            min = c;

        return min;
    }

    public int getMed(int a, int b, int c) {
        int[] ints = {a, b, c};

        Arrays.sort(ints);

        return ints[1];
    }
    public static void main(String[] args) {
        BasicAlgorithm ba = new BasicAlgorithm();
        System.out.println(ba.getMed(3, 1,2));
    }
}
