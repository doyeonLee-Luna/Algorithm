import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  // 1 ≤ N ≤ 1,000,000,000
        sc.close();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        long layer = 1;
        long maxNumberInLayer = 1;

        // 계속해서 껍질을 추가하면서 N이 해당 층 안에 들어갈 때까지 반복
        while (maxNumberInLayer < N) {
            maxNumberInLayer += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
