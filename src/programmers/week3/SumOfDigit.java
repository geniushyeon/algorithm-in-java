package programmers.week3;
// 자릿수 더하기
public class SumOfDigit {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDigit s = new SumOfDigit();
        System.out.println(s.solution(123));
    }
}
