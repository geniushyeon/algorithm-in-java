package baekjoon.week1;

import java.io.*;
import java.util.StringTokenizer;

public class SumByBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        int[] array = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            array[i] = a + b;
        }

        for (int i : array) {
            System.out.println(i);
        }
        br.close();
        bw.flush();
    }
}
