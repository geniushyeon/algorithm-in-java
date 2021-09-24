package leetcode.easy;

/**
 * https://leetcode.com/problems/remove-element/
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 */
public class RemoveElement {
	public static void main(String[] args) {
		RemoveElement solution = new RemoveElement();
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		System.out.println(solution.removeElement(nums, val));
	}

	public int removeElement(int[] nums, int val) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val)
				nums[result++] = nums[i];
		}
		return result;
	}
}
