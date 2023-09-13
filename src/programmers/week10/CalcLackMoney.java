package programmers.week10;

public class CalcLackMoney {

    public static void main(String[] args) {
        CalcLackMoney calcLackMoney = new CalcLackMoney();
        System.out.println("calcLackMoney.solution(3, 20, 4) = " + calcLackMoney.solution(3, 20, 4));
    }

    public long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (long) i * price;
        }

        if (sum <= money) {
            return 0;
        }

        return sum - money;
    }
}
