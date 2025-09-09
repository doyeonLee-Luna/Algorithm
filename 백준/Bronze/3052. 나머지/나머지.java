import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	HashSet<Integer> remainders = new HashSet<>();

		
		for ( int i = 0; i < 10; i++ ) {
			int num = Integer.parseInt(br.readLine());
			remainders.add(num % 42);
		}
		
		System.out.println(remainders.size());
		
	}
}