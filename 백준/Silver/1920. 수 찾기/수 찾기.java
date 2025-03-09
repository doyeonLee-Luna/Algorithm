

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] nArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nArr);
		
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for ( int i = 0;  i < M; i ++) {
			int tar = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(nArr, tar) ? "1\n" : "0\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static boolean binarySearch(int[] narr, int m) {
		int left = 0, right = narr.length - 1;
		while (left <= right) {
			int mid = (left + right ) / 2;
			if (narr [mid] == m ) {
				return true;
			} else if ( narr[mid] < m) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return false;
	}
}
