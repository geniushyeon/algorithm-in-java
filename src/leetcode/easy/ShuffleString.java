package leetcode.easy;

/**
 * https://leetcode.com/problems/shuffle-string/
 */
public class ShuffleString {
	public static void main(String[] args) {
		ShuffleString solution = new ShuffleString();
		String s = "aiohn";
		int[] indices = {3, 1, 4, 2, 0};
		System.out.println("solution.restoreString(s, indices) = " + solution.restoreString(s, indices));
	}

	public String restoreString(String s, int[] indices) {
		char[] chars = new char[indices.length];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			chars[indices[i]] = s.charAt(i);
		}

		for (char c : chars) {
			sb.append(c);
		}

		return sb.toString();
	}
}
