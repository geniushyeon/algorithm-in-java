package programmers.week2;
// 이상한 문자열 만들기.. 넘 어려웠다
public class StrangeString {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ", -1);
        char[] cArray;

        for (int i = 0; i < array.length; i++) {
            cArray = array[i].toCharArray();

            for (int j = 0; j < cArray.length; j++) {
                if (j % 2 == 0) {
                    cArray[j] = Character.toUpperCase(cArray[j]);
                } else {
                    cArray[j] = Character.toLowerCase(cArray[j]);
                }
                answer += cArray[j];
            }
            if (i != array.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StrangeString strangeString = new StrangeString();
        System.out.println(strangeString.solution("try hello world"));
    }
}
