package programmers.week9;

public class CountEvenOrOdd {

    public int[] mySolution(int[] numList) {
        int[] answer = new int[2];

        for (int i : numList) {
            if (i % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }

    public int[] anotherSolution(int[] numList) {
        int[] answer = new int[2];

        for (int i : numList) {
            answer[i % 2]++;
        }

        return answer;
    }
}
