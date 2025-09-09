import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int[] s = new int[8];
		int status = 0;
		
		for( int i = 0; i < 8; i++ ) {
			s[i] = Integer.parseInt(input[i]);
		}
		
		for ( int i = 0; i < 7; i++ ) {
			if (s[i] < s[i+1]) {
				if (status == 0) status = 1;
				else if (status == 2) {
					status = 3;
					break;
				}
			} else if (s[i] > s[i+1]) {
				if (status == 0) status = 2;
				else if (status == 1) {
					status = 3;
					break;
				}
			} else {
				status = 3;
				break;
			}
		}
		
		if (status == 1) {
			System.out.println("ascending");
		} else if (status == 2) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
