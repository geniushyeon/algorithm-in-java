package leetcode.easy;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1dArray {
	public static void main(String[] args) {
		RunningSumOf1dArray solution = new RunningSumOf1dArray();
		int[] nums = {3, 1, 2, 10, 1};
		int[] result = solution.runningSum(nums);
		for (int r : result)
			System.out.println("r = " + r);
	}

	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i - 1] + nums[i];
		}

		return result;
	}
}
