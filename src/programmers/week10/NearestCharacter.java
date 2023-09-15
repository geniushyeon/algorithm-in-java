package programmers.week10;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */
public class NearestCharacter {

    public static void main(String[] args) {
        NearestCharacter nearestCharacter = new NearestCharacter();
        int[] array = nearestCharacter.solution("banana");

        for (int i : array) {
            System.out.println(i);
        }
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < answer.length; i++) {
            answer[i] = getIndex(s, i);
        }

        return answer;
    }

    private int getIndex(String s, int lastIndex) {
        int index = lastIndex - 1;
        int distance = 1;

        while (index >= 0) {
            if (s.charAt(lastIndex) == s.charAt(index)) {
                return distance;
            }
            distance++;
            index--;
        }
        return -1;
    }
}
