package leetcode.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {
	public static void main(String[] args) {
		ReverseInteger solution = new ReverseInteger();
		int x = -123;
		System.out.println(solution.fixedSolution(x));
	}

	public int reverse(int x) {
		if (x == 0)
			return 0;

		char[] chars = String.valueOf(x).toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			if (chars[left] == '-') {
				left++;
				continue;
			}

			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}

		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			sb.append(c);
		}

		long result = Long.parseLong(sb.toString());
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;

		return (int) result;
	}

	public int fixedSolution(int x) {
		if (x == 0)
			return x;

		int result = 0;

		while (x != 0) {
			int digit = x % 10;
			x /= 10;
			if (result > 0 && (Integer.MAX_VALUE - digit) / 10 < result)
				return 0;

			if (result < 0 && (Integer.MIN_VALUE - digit) / 10 > result)
				return 0;

			result = result * 10 + digit;
		}

		return result;
	}
}
