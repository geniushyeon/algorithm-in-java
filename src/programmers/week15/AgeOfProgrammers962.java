package programmers.week15;

public class AgeOfProgrammers962 {

    public static void main(String[] args) {
        System.out.println(new AgeOfProgrammers962().solution(100));;
    }

    public String solution(int age) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        String answer = "";

        while (age > 0) {
            answer += alphabets[age % 10];
            age /= 10;
        }

        return answer;
    }
}
