

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()); // 첫 번째 입력값 (정수)
        String B = br.readLine(); // 두 번째 입력값 (세 자리 숫자 문자열)

        // 각 자리수를 정수로 변환
        int C = (B.charAt(2) - '0') * A; // 일의 자리 곱셈
        int D = (B.charAt(1) - '0') * A; // 십의 자리 곱셈
        int E = (B.charAt(0) - '0') * A; // 백의 자리 곱셈

        int F = C + (D * 10) + (E * 100); // 최종 결과

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}