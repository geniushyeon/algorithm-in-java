package programmers.week3;

public class ReverseIntegers {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        StringBuffer sb = new StringBuffer(str);
        str = sb.reverse().toString();

        char[] chars = str.toCharArray();
        answer = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseIntegers ri = new ReverseIntegers();
        for (int i : ri.solution(12345)) {
            System.out.println(i);
        }
    }
}
