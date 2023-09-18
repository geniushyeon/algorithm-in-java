package programmers.week11;

public class SplitArray {

    public static void main(String[] args) {
        SplitArray splitArray = new SplitArray();
        int[] solution = splitArray.solution(new int[]{1, 3, 5}, 1, 2);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1 + 1;

        int[] answer = new int[length];
        int index = num1;

        for (int i = 0; i < length; i++) {
            answer[i] = numbers[index];
            index++;
        }

        return answer;
    }

    public int[] anotherSolution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }

        return answer;
    }
}
