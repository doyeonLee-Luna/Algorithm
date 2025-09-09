import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for ( int i = 0; i < T; i++) {
		String[] input = br.readLine().split(" ");
		int R = Integer.parseInt(input[0]);
		String s = input[1];
		
		StringBuilder sb = new StringBuilder();
		for ( int j = 0; j < s.length(); j++) {
			for ( int k = 0; k < R; k++) {
			sb.append(s.charAt(j));
			}
		}
		
		System.out.println(sb.toString());
		
		}
	}
}