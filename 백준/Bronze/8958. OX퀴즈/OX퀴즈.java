import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		for (int i = 0; i < num; i++) {
			String s = br.readLine(); // OX 문자열 입력
			int score = 0;  // 현재 연속된 O 점수
			int total = 0;  // 총 점수
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'O') {
					score++;
					total += score;
				} else {
					score = 0;
				}
			}
			System.out.println(total);
		}
	}
}
