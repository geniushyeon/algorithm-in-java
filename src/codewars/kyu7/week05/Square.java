package codewars.kyu7.week05;

public class Square {

	public static boolean isSquare(int n) {
		double sqrt = Math.sqrt(n);
		return sqrt == Math.floor(sqrt);
	}

	public static boolean clever(int n) {
		return Math.sqrt(n) % 1 == 0;
	}
}
