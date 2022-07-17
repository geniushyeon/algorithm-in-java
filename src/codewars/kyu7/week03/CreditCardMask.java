package codewars.kyu7.week03;

public class CreditCardMask {

	public static String maskify(String str) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length() - 4; i++) {
			result.append("#");
		}

		return result + str.substring(str.length() - 4);
	}

	public static String maskifyWithRegExp(String str) {
		if (str.length() <= 4) {
			return str;
		}

		String maskified = str.substring(0, str.length() - 4).replaceAll("[\\s\\w\\W]", "#");
		String substring = str.substring(str.length() - 4);

		return maskified + substring;
	}

	public static String clever(String str) {
		return str.replaceAll(".(?=.{4})", "#");
	}

	public static void main(String[] args) {
		System.out.println(maskify("4556364607935616"));
		System.out.println(maskifyWithRegExp("4556364607935616"));
		System.out.println(clever("4556364607935616"));
	}
}
