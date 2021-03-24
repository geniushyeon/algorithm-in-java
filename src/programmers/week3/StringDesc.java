package programmers.week3;

import java.util.Arrays;

public class StringDesc {
    public String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length-1; i >=0; i--) {
            answer += chars[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        StringDesc stringDesc = new StringDesc();
        stringDesc.solution("Zbcdefg");

    }
}
