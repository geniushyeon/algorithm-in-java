package codewars.kyu7.week02;

public class DeodorantEvaporator {

	public static int evaporator(double content, double evap_per_day, double threshold) {

		int result = 0;
		double percentage = 100;

		while (percentage > threshold) {
			percentage -= percentage * (evap_per_day / 100);
			result++;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(evaporator(10, 10, 10));
	}
}
