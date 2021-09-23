package leetcode.easy;

/**
 * https://leetcode.com/problems/build-array-from-permutation/
 */
public class BuildArrayFromPermutation {
	public static void main(String[] args) {
		BuildArrayFromPermutation solution = new BuildArrayFromPermutation();
		int[] nums = {0, 2, 1, 5, 3, 4};
		int[] result = solution.buildArray(nums);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public int[] buildArray(int[] nums) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[nums[i]];
		}

		return result;
	}
}
