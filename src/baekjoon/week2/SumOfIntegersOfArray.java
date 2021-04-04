package baekjoon.week2;
// 15596번
public class SumOfIntegersOfArray {
    long sum(int[] a) {
        long sum = a[0];

        for (int i = 1; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
