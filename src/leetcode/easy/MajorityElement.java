package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
	public static void main(String[] args) {
		MajorityElement solution = new MajorityElement();
		int[] nums = {3, 2, 3};
		System.out.println(solution.majorityElement(nums));
	}

	// 7ms
	public int majorityElement(int[] nums) {
		int majority = nums.length / 2;

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : map.keySet()) {
			if (map.get(num) > majority) {
				return num;
			}
		}

		return 0;
	}

	// faster solution: 1ms
	public int majorityElement2(int[] nums) {
		int major = nums[0];
		int count = 0;

		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				count++;
				major = nums[i];
			} else if (major == nums[i]) {
				count++;
			} else {
				count--;
			}
		}

		return major;
	}
}
