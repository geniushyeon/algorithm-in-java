package codewars.kyu7.week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class TwoToOne {

	public static String longest(String s1, String s2) {

		Set<Character> characterSet = new HashSet<>();
		String s = s1 + s2;

		for (Character c : s.toCharArray()) {
			characterSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character c : characterSet) {
			sb.append(c);
		}

		char[] chars = sb.toString().toCharArray();
		Arrays.sort(chars);

		sb = new StringBuilder();

		for (char c : chars) {
			sb.append(c);
		}

		return sb.toString();
	}

	public static String clever(String s1, String s2) {

		StringBuilder sb = new StringBuilder();
		(s1 + s2).chars()
				.distinct()
				.sorted()
				.forEach(c -> sb.append((char) c));

		return sb.toString();
	}
}
