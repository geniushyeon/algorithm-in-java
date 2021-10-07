package leetcode.easy;

/**
 * https://leetcode.com/problems/sorting-the-sentence/
 */
public class SortingTheSentence {
	public static void main(String[] args) {
		SortingTheSentence solution = new SortingTheSentence();
		System.out.println(solution.sortSentence("Myself2 Me1 I4 and3"));
	}

	public String sortSentence(String s) {
		String[] ans = new String[s.split(" ").length];

		for (String str : s.split(" ")) {
			ans[str.charAt(str.length() - 1) - '1'] = str.substring(0, str.length() - 1);
		}

		return String.join(" ", ans);
	}
}
