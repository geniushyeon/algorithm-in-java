package leetcode.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

	public static void main(String[] args) {
		LengthOfLastWord solution = new LengthOfLastWord();
		String s = "   fly me   to   the moon  ";
		System.out.println(solution.lengthOfLastWord(s));
	}

	/**
	 * 문자열 제거 메소드
	 * trim(): 앞뒤 공백 제거 문자열의 복사본 리턴. '\u0020' 이하의 공백들만 제거
	 * strip(): Java11 이후 새로 추가된 메소드. 유니코드의 공백들을 모두 제거
	 */
	public int lengthOfLastWord(String s) {
		String[] array = s.strip().split(" ");

		return array[array.length - 1].length();
	}
}
