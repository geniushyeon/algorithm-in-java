package programmers.week15;

public class Ants {
    public static void main(String[] args) {
        System.out.println(new Ants().solution(24));
    }

    public int solution(int hp) {
        int answer = 0;

        // 장군 개미
        answer += hp / 5;
        hp %= 5;

        // 병정 개미
        answer += hp / 3;
        hp %= 3;

        // 일개미
        answer += hp;

        return answer;
    }
}
