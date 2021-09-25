package leetcode.easy;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubArray {
	public static void main(String[] args) {
		MaximumSubArray solution = new MaximumSubArray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(solution.maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int curMax = nums[0];
		int allMax = nums[0];

		for (int i = 1; i < nums.length; i++) {
			curMax = Math.max(nums[i], curMax + nums[i]);
			allMax = Math.max(allMax, curMax);
		}

		return allMax;
	}
}
