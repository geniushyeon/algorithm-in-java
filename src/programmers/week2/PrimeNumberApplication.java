package programmers.week2;
// 에라토스테네스의 체
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberApplication {
    public static int solution(int n) {
        int answer = 0;

        int[] arr = new int[n+1];

        for(int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            // 이미 지워진 경우
            if (arr[i] == 0)
                continue;
            // 지워지지 않은 경우, 자기 자신을 제외한 수부터 배수 지우기
            for (int j = i + i; j <= n; j = j + i) {
                if (arr[j] == 0)
                    continue;
                else
                    arr[j] = 0; // 지우기(0으로 저장)
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        answer = list.size();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
