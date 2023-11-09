package programmers.week15;

public class Login {

    public static void main(String[] args) {

    }

    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for (String[] data : db) {
            if (data[0].equals(id) && data[1].equals(pw)) {
                return "login";
            } else if (data[0].equals(id)) {
                return "wrong pw";
            }
        }

        return "fail";
    }
}
