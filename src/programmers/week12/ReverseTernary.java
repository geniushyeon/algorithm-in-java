package programmers.week12;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
public class ReverseTernary {

    public static void main(String[] args) {
        ReverseTernary solution = new ReverseTernary();
        System.out.println(solution.betterSolution(125));
    }

    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }
        int answer = 0;
        int index = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {
            answer += (int) (Integer.parseInt(String.valueOf(sb.charAt(i))) * Math.pow(3, index));
            index++;
        }

        return answer;
    }

    // better solution
    public int betterSolution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
