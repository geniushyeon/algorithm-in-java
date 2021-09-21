package leetcode.easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 * Given an integer x, return true if x is palindrome integer.
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		PalindromeNumber solution = new PalindromeNumber();
		int x = 10;
		System.out.println(solution.isPalindrome(x));
	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int reversed = 0;
		int y = x;

		while (y != 0) {
			int digit = y % 10;
			y /= 10;

			reversed = reversed * 10 + digit;
		}

		return reversed == x;
	}
}
