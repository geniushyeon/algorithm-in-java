package leetcode.easy;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
	public static void main(String[] args) {
		RichestCustomerWealth solution = new RichestCustomerWealth();
		int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};

		System.out.println("solution.maximumWealth(accounts) = " + solution.maximumWealth(accounts));
	}

	public int maximumWealth(int[][] accounts) {
		int[] resultArray = new int[accounts.length];

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[0].length; j++) {
				resultArray[i] += accounts[i][j];
			}
		}

		int max = resultArray[0];

		for (int i = 1; i < resultArray.length; i++) {
			if (resultArray[i] > max)
				max = resultArray[i];
		}

		return max;
	}
}
