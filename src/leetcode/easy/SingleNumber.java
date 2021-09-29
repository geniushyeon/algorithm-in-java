package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
	public static void main(String[] args) {
		SingleNumber solution = new SingleNumber();
		int[] nums = {4,1,2,1,2};
		System.out.println(solution.singleNumber(nums));
	}

	public int singleNumber(int[] nums) {
		if (nums.length == 1) return nums[0];

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Integer num : map.keySet()) {
			if (map.get(num) == 1)
				return num;
		}
		
		return 0;
	}
}
