package basic;

import java.io.*;
import java.util.StringTokenizer;

public class BaekjoonForm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTestCases; i++) {
            st = new StringTokenizer(br.readLine());

            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            // 첫 번째 수 출력
            bw.write(String.valueOf(one) + "\n");

            // StringBuilder 사용하여 두 수 역순 출력
            StringBuilder sb = new StringBuilder();
            sb.append(one).append(" ").append(two);
            sb.reverse();

            bw.write(sb.toString()); // 버퍼에 입력
        }

        // 버퍼 플러시 후 종료
        bw.close();
    }
}
