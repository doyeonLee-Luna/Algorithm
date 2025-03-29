class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0; // 꺼내려는 상자의 갯수
        int row = (num-1)/w; // 꺼내려는 상자의 행 계산
        int wIdx = w-1; // 가로 인덱스
        int col = 0; // 꺼내려는 상자의 열
        
        if (row%2 == 0) { // 짝수 행(그대로)
            col = (num-1) % w;
        } else { // 홀수 행(반대로)
            col = wIdx - (num-1) % w;
        }

        // 현재 박스 포함, 위에 있는 상자의 번호 계산
        for (; row < (n+wIdx)/w; row++) { // 정수 나눗셈에서 올림 (n+w-1)/w
            int aboveBox = 0; // 위에 있는 박스의 열
            if (row % 2 == 0) { // 짝수 행(그대로)
                aboveBox = col + (row * w); 
            } else { // 홀수 행(반대로)
                aboveBox = (wIdx - col) + (row * w);
            }
            // 전체 상자 갯수안에 있다면 +
            if (aboveBox < n) { 
                answer++;
            }
        }

        return answer;
    }
}