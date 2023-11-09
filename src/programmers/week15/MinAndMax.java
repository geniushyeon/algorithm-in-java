package programmers.week15;

import java.util.Arrays;
import java.util.Comparator;

public class MinAndMax {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] numbers = s.split(" ");
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1 = Integer.parseInt(o1);
                int num2 = Integer.parseInt(o2);
                if (num1 > num2) {
                    return 1;
                } else if (num1 < num2) {
                    return -1;
                }

                return 0;
            }
        });

        return sb.append(numbers[0])
                .append(" ")
                .append(numbers[numbers.length - 1])
                .toString();
    }
}
