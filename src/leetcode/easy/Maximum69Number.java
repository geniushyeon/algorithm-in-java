package leetcode.easy;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class Maximum69Number {
	public int maximum69Number (int num) {
		return Integer.parseInt(("" + num).replaceFirst("6", "9"));
	}
}
