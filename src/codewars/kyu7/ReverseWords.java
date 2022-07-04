package codewars.kyu7;

import java.util.StringTokenizer;

public class ReverseWords {

	public static String reverseWords(final String original) {

		StringTokenizer st = new StringTokenizer(original, " ", true);
		StringBuilder sb = new StringBuilder();

		while (st.hasMoreTokens()) {
			sb.append(new StringBuilder(st.nextToken()).reverse());
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
		System.out.println(reverseWords("    "));
	}
}
