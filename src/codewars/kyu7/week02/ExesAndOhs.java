package codewars.kyu7.week02;

public class ExesAndOhs {

	public static boolean getXO(String str) {
		str = str.toLowerCase();

		return str.replace("o", "").length() == str.replace("x", "").length();
	}

	public static void main(String[] args) {
		System.out.println(getXO("XxxxooO"));
		System.out.println(getXO("zssddd"));
	}
}
