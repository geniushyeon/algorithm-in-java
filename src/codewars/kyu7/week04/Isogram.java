package codewars.kyu7.week04;

import java.util.HashMap;
import java.util.Map;

public class Isogram {

	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
		Map<Character, Integer> strMap = new HashMap<>();

		for (Character c : str.toCharArray()) {
			strMap.put(c, strMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
			if (entry.getValue() > 1) {
				return false;
			}
		}

		return true;
	}

	public static boolean clever(String str) {
		return str.length() == str.chars()
				.distinct()
				.count();
	}
}
