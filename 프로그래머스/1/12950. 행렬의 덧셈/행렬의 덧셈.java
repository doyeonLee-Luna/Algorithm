import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;            // 행 개수
        int cols = arr1[0].length;         // 열 개수 (모든 행이 같은 길이라 가정)
        
        // 결과를 담을 배열 미리 생성
        int[][] answer = new int[rows][cols];
        
        //행렬 덧셈 수행
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
