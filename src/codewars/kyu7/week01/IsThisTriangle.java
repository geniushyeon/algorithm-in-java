package codewars.kyu7.week01;

public class IsThisTriangle {
	public static boolean isTriangle(int a, int b, int c){
		return a < b + c && b < a + c && c < a + b;
	}

	public static void main(String[] args) {
		System.out.println(isTriangle(3, 3, 5));
	}
}
