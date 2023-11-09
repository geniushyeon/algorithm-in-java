package leetcode.easy;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3};
        System.out.println(digits.length);
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }
    public int[] plusOne(int[] digits) {
        BigInteger number = BigInteger.ZERO;

        // 숫자 구하기
        for (int digit : digits) {
            number = number.multiply(BigInteger.TEN);
            number = number.add(BigInteger.valueOf(digit));
        }

        // 1 더하기
        number = number.add(BigInteger.ONE);

        // BigInteger를 문자열로 변환 후 각 문자를 숫자로 변환하여 배열에 저장
        String numberStr = number.toString();
        int[] answer = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            answer[i] = numberStr.charAt(i) - '0';
        }

        return answer;
    }
}
