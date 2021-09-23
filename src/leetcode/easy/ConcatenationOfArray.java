package leetcode.easy;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {
	public static void main(String[] args) {
		ConcatenationOfArray solution = new ConcatenationOfArray();
		int[] nums = {1, 4, 2, 1};
		int[] result = solution.getConcatenation(nums);

		for (int i : result)
			System.out.println(i);
	}

	public int[] getConcatenation(int[] nums) {
		int[] result = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i];
			result[i + nums.length] = nums[i];
		}

		return result;
	}
}
