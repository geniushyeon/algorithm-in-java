package programmers.week9;

public class Pizzas {

    public int solution(int slice, int n) {
        if (n % slice == 0) {
            return n / slice;
        }

        return (int) n / slice + 1;
    }
}
