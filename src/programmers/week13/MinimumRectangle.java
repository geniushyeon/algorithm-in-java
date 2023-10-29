package programmers.week13;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */
public class MinimumRectangle {

    public static void main(String[] args) {
        MinimumRectangle minimumRectangle = new MinimumRectangle();
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = minimumRectangle.solution(sizes);

        System.out.println(solution);
    }

    public int solution(int[][] sizes) {
        int height = 0;
        int length = 0;

        for (int[] size : sizes) {
            height = Math.max(height, Math.max(size[0], size[1]));
            length = Math.max(length, Math.min(size[0], size[1]));
        }

        return height * length;
    }
}
