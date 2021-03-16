package programmers.week2;

public class PhonenumberApplication {
    public String solution(String phoneNumber) {
        String answer = "";

        int num = phoneNumber.length() - 4;
        String a = phoneNumber.substring(0, num).replaceAll(".", "*");
        String b = phoneNumber.substring(num);

        answer = a + b;

        return answer;
    }

    public String solution2(String phoneNumber) {
        char[] ch = phoneNumber.toCharArray();

        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }

}
