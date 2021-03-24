package programmers.week2;

// 시저 암호
public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                if (ch >= 65 && ch <= 90) { // 대문자
                    if (ch + n > 90) {
                        ch -= 26;
                    }
                } else if (ch >= 97 && ch <= 122) { // 소문자
                    if (ch + n > 122) {
                        ch -= 26;
                    }
                }
                ch += n;
            } else {
                ch = ' ';
            }

            answer += ch;
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        System.out.println(cc.solution("aBCdEZ", 4));
    }
}
