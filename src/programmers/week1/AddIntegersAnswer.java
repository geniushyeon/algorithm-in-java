package programmers.week1;

// if-else문 필요 없음
// Math 클래스!!! 별 다섯개
public class AddIntegersAnswer {
    public long solution(int a, int b) {
        long answer = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }

        return answer;
    }

}
