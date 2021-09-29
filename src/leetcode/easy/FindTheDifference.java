package leetcode.easy;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {
	public static void main(String[] args) {
		FindTheDifference solution = new FindTheDifference();
		System.out.println(solution.findTheDifference("abcd", "abcde"));
	}

	public char findTheDifference(String s, String t) {
		int charCode = t.charAt(s.length());

		for (int i = 0; i < s.length(); i++) {
			charCode -= (int)s.charAt(i);
			charCode += (int)t.charAt(i);
		}

		return (char)charCode;
	}
}
