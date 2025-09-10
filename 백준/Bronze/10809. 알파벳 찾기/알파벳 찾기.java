import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int[] al = new int[26];

		// 배열 초기화 (-1로)
		for (int i = 0; i < 26; i++) {
			al[i] = -1;
		}

		// 각 알파벳의 처음 등장 위치 기록
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 'a';
			if (al[index] == -1) {
				al[index] = i;
			}
		}

		// 한 줄에 공백으로 구분하여 출력
		for (int i = 0; i < 26; i++) {
			System.out.print(al[i] + " ");
		}
	}
}
