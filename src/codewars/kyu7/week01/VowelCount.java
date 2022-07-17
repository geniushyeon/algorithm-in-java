package codewars.kyu7.week01;

public class VowelCount {

	public static int getCount(String str) {
		int vowelsCount = 0;

		char[] vowels = {'a', 'e', 'i', 'o', 'u'};

		for (char c : str.toCharArray()) {
			for (char v : vowels) {
				if (c == v) {
					vowelsCount++;
				}
			}
		}
		return vowelsCount;
	}

	public static void main(String[] args) {
		String str = "abracadabra";
		System.out.println(getCount(str));
	}
}
