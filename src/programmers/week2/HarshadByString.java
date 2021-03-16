package programmers.week2;

public class HarshadByString {
    public boolean solution(int x) {
        int sum = 0;
        String[] temp = String.valueOf(x).split("");

        for (String s : temp) {
            sum += Integer.parseInt(s);
        }

        if (x % sum != 0) {
            return false;
        } else {
            return true;
        }
    }
}
