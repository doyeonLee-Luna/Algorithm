

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층 방 수 (사실 계산에 직접 쓰진 않음)
            int N = Integer.parseInt(st.nextToken()); // N번째 손님

            int floor = (N - 1) % H + 1;   // 몇 층
            int room  = (N - 1) / H + 1;   // 몇 호(엘리베이터로부터 몇 번째)

            int roomNumber = floor * 100 + room;
            sb.append(roomNumber).append('\n');
        }

        System.out.print(sb.toString());
    }
}
