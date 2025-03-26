
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		
		if ( B < 45 ) {
			B = 60 - 45 + B;
			A = A - 1;
			if ( A == -1) {
				A = 23;
			}
			System.out.println(A + " " +B);
		} else {
			B = B - 45;
			System.out.println(A + " " + B);
		}
	}
	

	
}