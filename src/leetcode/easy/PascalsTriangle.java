package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle
 */
public class PascalsTriangle {

	public static void main(String[] args) {
		PascalsTriangle solution = new PascalsTriangle();
		List<List<Integer>> result = solution.generate(5);

		for (List<Integer> r : result) {
			for (Integer i : r) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> allRows = new ArrayList<>();
		List<Integer> row = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			row.add(0, 1);

			for (int j = 1; j < row.size() - 1; j++) {
				row.set(j, row.get(j) + row.get(j + 1));
			}
			allRows.add(new ArrayList<>(row));
		}

		return allRows;
	}
}
