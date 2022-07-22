package codewars.kyu7.week04;

public class Mumbling {

	public static String accum(String s) {

		String[] split = s.toLowerCase().split("");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < split.length; i++) {
			String str = split[i];
			sb.append(str.toUpperCase());
			sb.append(str.repeat(i));

			if (i != split.length - 1) {
				sb.append("-");
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(accum("abcd"));
	}
}
