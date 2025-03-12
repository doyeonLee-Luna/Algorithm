import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int solution(String begin, String target, String[] words) {
		int answer = bfs(begin, target, words);
		
		return answer; // 결과
	}
	
	public static boolean OneChar(String word1, String word2) {
		int diffcnt = 0;
		for ( int i = 0 ; i < word1.length(); i++ ) {
			if ( word1.charAt(i) != word2.charAt(i)) {
				diffcnt++;
			}
		}
		
		return diffcnt == 1; // 단어가 1글자만 다르면 true
	}
	
	public static int bfs(String begin, String target, String[] words) {
		int a = words.length; 
		
		// target 이 words 에 없으면 안 됨 
		boolean targetWords = false;
		for ( String word : words) {
			if ( word.equals(target)) {
				targetWords = true;
				break;
			}
		}
		
		// target 이 words 에 없으면 0 반환 
		if ( !targetWords) {
			return 0;
		}
		
		
		// 방문 여부 
		boolean[] visited = new boolean[a];
		
		
		Queue<int[]> queue = new LinkedList<>();
		
        for (int i = 0; i < a; i++) {
            if (OneChar(begin, words[i])) {
                queue.offer(new int[] {i, 1});  // words[i]로 한 번의 변환
                visited[i] = true;
            }
        }

		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int move = current[0];
			int dis = current[1];
			
			if (words[move].equals(target)) {
				return dis;
			}
			
			for ( int i = 0; i < a; i++) {
				if ( !visited[i] && OneChar(words[move], words[i])) {
					visited[i] = true;
					
					queue.offer(new int[] { i, dis + 1});
				}
			
			}
			
		}
		
		return 0; // queue 비어있는 경우 반환 불가능
	}
		
		
	
}
	