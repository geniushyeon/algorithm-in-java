package codewars.kyu7.week03;

import java.util.ArrayList;
import java.util.List;

public class NumberOfPeopleInTheBus {

	public static int countPassengers(List<int[]> stops) {

		int result = 0;

		for (int[] stop : stops) {
			result += stop[0] - stop[1];
		}

		return result;
	}

	public static int clever(List<int[]> stops) {
		return stops.stream()
				.mapToInt(x -> x[0] - x[1])
				.sum();
	}


	public static void main(String[] args) {

		List<int[]> stops = new ArrayList<>();
		stops.add(new int[] {10, 0});
		stops.add(new int[] {3, 5});
		stops.add(new int[] {2, 5});

		System.out.println(countPassengers(stops));
		System.out.println(clever(stops));
	}
}
