import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;

            // 각 자리수 더하기
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N) {
                result = i;
                break; // 가장 작은 생성자 찾았으면 바로 종료
            }
        }

        System.out.println(result); // 생성자가 없으면 그대로 0 출력됨
    }
}
