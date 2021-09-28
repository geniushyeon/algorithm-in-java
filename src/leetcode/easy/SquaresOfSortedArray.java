package leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {

	public static void main(String[] args) {
		SquaresOfSortedArray solution = new SquaresOfSortedArray();
		int[] nums = {-4, -1, 0, 3, 10};
		nums = solution.sortedSquares(nums);
		for (int n : nums)
			System.out.println(n);
	}

	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.pow(nums[i], 2);
		}
		Arrays.sort(nums);

		return nums;
	}
}
