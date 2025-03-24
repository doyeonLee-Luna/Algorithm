import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄을 읽고 공백을 기준으로 나누기
        String[] inputs = br.readLine().split(" ");

        // 각 값을 Integer.parseLong()로 long 타입으로 변환
        long A = Long.parseLong(inputs[0]);
        long B = Long.parseLong(inputs[1]);
        long C = Long.parseLong(inputs[2]);

        // 세 정수의 합을 출력
        System.out.println(A + B + C);
    }
}
