package leetcode.easy;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
	public static void main(String[] args) {
		MissingNumber solution = new MissingNumber();
		int[] nums = {0,1};
		System.out.println(solution.missingNumber(nums));
	}

	public int missingNumber(int[] nums) {
		int sum = nums.length * (nums.length + 1) / 2;
		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
		}
		return sum;
	}
}
