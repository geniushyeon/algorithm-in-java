package programmers.week9;

public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] numList = {1, 2, 3, 4, 5};
        int[] solution = reverseArray.solution(numList);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] num_list) {
        int length = num_list.length;

        for (int i = 0; i < length / 2; i++) {
            int index = length - 1 - i;
            int temp = num_list[index];
            num_list[index] = num_list[i];
            num_list[i] = temp;
        }

        return num_list;
    }
}
