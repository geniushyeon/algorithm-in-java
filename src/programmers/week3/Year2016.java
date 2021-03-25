package programmers.week3;

public class Year2016 {
    public String solution(int a, int b) {
        String answer = "";

        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diff = b - 1;

        for (int i = 1; i < a; i++) {
            diff += month[i - 1];
        }

        return days[diff % 7];
    }

    public static void main(String[] args) {
        Year2016 year = new Year2016();
        System.out.println(year.solution(5, 24));
    }
}
