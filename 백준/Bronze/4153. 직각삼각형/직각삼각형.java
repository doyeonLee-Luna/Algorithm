import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String line = br.readLine();
			String[] parts = line.split(" ");
			
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			int c = Integer.parseInt(parts[2]);
			
			if ( a == 0 && b == 0 && c == 0) {
				break;
			}
			
			int max = Math.max( a, Math.max(b, c) );
			int sum = a*a + b*b + c*c - max*max;
			
			if ( max*max == sum ) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
			
	