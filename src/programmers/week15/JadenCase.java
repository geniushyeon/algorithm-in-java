package programmers.week15;

public class JadenCase {

    public static void main(String[] args) {
        System.out.println(new JadenCase().solution("  for the what 1what  "));
    }

    public String solution(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) {
                break;
            }

            char[] chars = array[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char c = j == 0 ? Character.toUpperCase(chars[j]) : Character.toLowerCase(chars[j]);
                sb.append(c);
            }
            if (i == array.length - 1) break;
            sb.append(" ");
        }

        if (s.length() != sb.length()) {
            int abs = Math.abs(s.length() - sb.length());
            sb.append(" ".repeat(Math.max(0, abs)));
        }
        return sb.toString();
    }


    public String gracefulSolution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split("");
        boolean flag = true;

        for (String str : split) {
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ");
        }

        return answer;
    }
}
