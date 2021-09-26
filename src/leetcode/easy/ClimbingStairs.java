package leetcode.easy;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
	public static void main(String[] args) {
		ClimbingStairs solution = new ClimbingStairs();
		System.out.println(solution.climbStairs(8));
	}

	public int climbStairs(int n) {
		// base cases
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int oneStepBefore = 2;
		int twoStepsBefore = 1;
		int allWays = 0;

		for (int i = 2; i < n; i++) {
			allWays = oneStepBefore + twoStepsBefore;
			twoStepsBefore = oneStepBefore;
			oneStepBefore = allWays;
		}

		return allWays;
	}

	public int climbStairs2(int n) {
		if (n == 0 || n == 1 || n == 2)
			return n;

		int[] array = new int[n];
		array[0] = 1;
		array[1] = 2;

		for (int i = 2; i < n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		return array[n - 1];
	}
}
