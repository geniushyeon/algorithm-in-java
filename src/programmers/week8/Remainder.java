package programmers.week8;

public class Remainder {

	public int solution(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Remainder remainder = new Remainder();
		System.out.println(remainder.solution(12));
	}
}
