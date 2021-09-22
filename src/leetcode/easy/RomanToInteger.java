package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
	public static void main(String[] args) {
		RomanToInteger solution = new RomanToInteger();
		String s = "IV";
		System.out.println(solution.romanToInt(s));
	}

	public int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<>();

		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int prev = 0;

		for (Character c : s.toCharArray()) {
			int value = romanMap.get(c);
			if (value > prev) {
				result -= prev;
				result += value - prev;
			} else {
				result += value;
			}
			prev = value;
		}

		return result;
	}
}
