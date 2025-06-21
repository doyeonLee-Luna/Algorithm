class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 연속된 수의 시작 값 계산
        int start = (total - (num * (num - 1) / 2)) / num;
        
        // 연속된 숫자 배열 만들기
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}
