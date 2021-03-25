package programmers.week3;

public class SortStrings {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        String str = answer[0];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (answer[j].charAt(n) > answer[j + 1].charAt(n)) {
                    str = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = str;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SortStrings ss = new SortStrings();
        String[] strings = {"sun", "car", "cdx"};
        for (String s : ss.solution(strings, 2)) {
            System.out.println(s);
        }
    }
}