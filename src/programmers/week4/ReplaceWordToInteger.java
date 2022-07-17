package programmers.week4;

/**
 * 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
 */
public class ReplaceWordToInteger {

	public int replace(String s) {

		String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		for (int i = 0; i < 10; i++) {
			s = s.replace(array[i], String.valueOf(i));
		}

		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		ReplaceWordToInteger solution = new ReplaceWordToInteger();
		System.out.println(solution.replace("one4seveneight"));
	}
}
