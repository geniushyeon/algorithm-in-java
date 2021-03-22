package programmers.week3;

public class SquareRoot {
    public long solution(long n) {
        long answer = 0;

        answer = n %Math.sqrt(n) == 0 ? (long) ((Math.sqrt(n) + 1 ) *(Math.sqrt(n) + 1 )) : -1;

        return answer;
    }

    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();

        System.out.println(sr.solution(3));
    }

}
