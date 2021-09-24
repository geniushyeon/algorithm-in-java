package leetcode.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
		int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
		System.out.println(solution.removeDuplicates(nums));
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int result = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[result]) {
				nums[++result] = nums[i];
			}
		}
		return result + 1;
	}
}
