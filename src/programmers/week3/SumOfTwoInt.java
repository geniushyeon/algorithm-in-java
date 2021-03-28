package programmers.week3;

import java.util.*;

/*
* 두 개 뽑아서 더하기
정수 배열 numbers가 주어집니다.
* numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
* 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
* */
public class SumOfTwoInt {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        SumOfTwoInt twoInt = new SumOfTwoInt();
        for (int i : twoInt.solution(numbers)) {
            System.out.println(i);
        }
    }
}
