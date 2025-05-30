import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> basket = new Stack<>();
        
        // moves 배열
        for ( int k = 0; k < moves.length; k++ ) {
            int move = moves[k] - 1; // moves 는 1부터 시작 
            
            // board 에서 가장 위에 있는 인형 
            for ( int i = 0; i < board.length; i++ ) {
                // 그 줄에 인형 이 없는 경우
                if ( board[i][move] == 0 ) {
                    continue;
                } else { // 그 줄 맨 위에 있는 인형 선택
                    int picked = board[i][move]; 
                    // 맨 위에 있는 인형은 버리거나 바구니에 넣을 거니 0으로 만들어줌
                    board[i][move] = 0;
                    
                    if ( !basket.isEmpty() && basket.peek() == picked ) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(picked);
                    }
                    
                    // 인형을 버리거나 푸쉬한 조건 끝나면
                    break;
                    
                }
            }
        }
            
        // 버린 인형 개수 출력
        return answer;
    }
}