package leetcode.easy;

/**
 * https://leetcode.com/problems/implement-strstr/
 * Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class ImplementstrStr {
	public static void main(String[] args) {
		ImplementstrStr solution = new ImplementstrStr();
		String haystack = "aaaaa";
		String needle = "bba";
		System.out.println(solution.strStr(haystack, needle));
	}

	public int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0;

		if (haystack.contains(needle))
			return haystack.indexOf(needle);

		return -1;
	}
}
