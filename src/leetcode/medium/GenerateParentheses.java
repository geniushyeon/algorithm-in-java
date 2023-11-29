package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        List<String> brackets = solution.generateParenthesis(3);

        for (String s : brackets) {
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        process(n, 0, 0, "", result);

        return result;
    }

    private void process(int n, int open, int closed, String s, List<String> result) {
        if (open == n && closed == n) {
            result.add(s);
            return;
        }

        if (open < n) {
            process(n, open + 1, closed, s + "(", result);
        }

        if (open > closed) {
            process(n, open, closed + 1, s + ")", result);
        }
    }
}
