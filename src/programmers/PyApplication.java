package programmers;

public class PyApplication {
    static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] pyArray = s.toCharArray();

        int pCount = 0;
        int yCount = 0;

        for (char c : pyArray) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }

        }
        if (pCount != yCount) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        boolean a = solution("PpyY");
        System.out.println(a);
    }
}
