package programmers.week15;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */
public class FoodFighters {

    public static void main(String[] args) {
        int[] food = new int[]{1, 7, 1, 2};

        System.out.println(new FoodFighters().solution(food));
    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] < 2) continue;
            answer.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String reversed = new StringBuilder(answer.toString()).reverse().toString();


        return answer + "0" + reversed;
    }
}
