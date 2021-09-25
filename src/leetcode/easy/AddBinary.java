package leetcode.easy;

import java.math.BigInteger;

public class AddBinary {

	public static void main(String[] args) {
		AddBinary solution = new AddBinary();
		String a = "1010";
		String b = "1011";
		System.out.println(solution.addBinary2(a, b));
	}

	// 5ms
	public String addBinary(String a, String b) {
		return (new BigInteger(a, 2).add(new BigInteger(b, 2))).toString(2);
	}

	// 1ms
	public String addBinary2(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0) sum += b.charAt(j--) - '0';
			if (i >= 0) sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}

		if (carry != 0)
			sb.append(carry);

		return sb.reverse().toString();
	}
}
