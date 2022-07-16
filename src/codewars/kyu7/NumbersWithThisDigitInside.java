package codewars.kyu7;

import java.util.ArrayList;
import java.util.List;

public class NumbersWithThisDigitInside {

	public static long[] numbersWithDigitInside(long x, long d) {

		long count;
		long sum = 0;
		long product = 0;

		List<Long> numbers = new ArrayList<>();

		for (long i = 1; i <= x; i++) {
			if (isDigitInside(i, d)) {
				numbers.add(i);
			}
		}

		count = numbers.size();

		if (numbers.size() > 0) {
			product = 1;
		}

		for (Long number : numbers) {
			sum += number;
			product *= number;
		}

		return new long[] {count, sum, product};
	}

	private static boolean isDigitInside(long x, long d) {
		while (x > 0) {
			if (x == d || x % 10 == d) {
				return true;
			}
			x /= 10;
		}
		return false;
	}
}
