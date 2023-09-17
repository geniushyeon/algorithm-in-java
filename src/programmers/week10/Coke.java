package programmers.week10;

public class Coke {

    public static void main(String[] args) {
        Coke coke = new Coke();
        System.out.println(coke.anotherSolution(3, 1, 20));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        int x = n;

        while (x >= a) {
            int y = x / a;
            x = x - (y * a) + (y * b);
            answer += y * b;
        }

        return answer;
    }


    public int anotherSolution(int a, int b, int n) {
        return (n > b ? n - b : 0) / (a - b) * b;
    }

    public int recursiveSolution(int a, int b, int n) {
        return recursive(a, b, n, 0);
    }

    public int recursive(int a, int b, int n, int result) {
        if (n < a) {
            return result;
        }

        int change = (n / a) * b;

        n = (n % a) + change;

        return recursive(a, b, n, result + change);
    }
}
