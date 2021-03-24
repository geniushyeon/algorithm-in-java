package programmers.week3;

public class SumMatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumMatrix s = new SumMatrix();
        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[3][4];
        s.solution(arr1, arr2);
    }
}
