class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = (len + n - 1) / n; // 필요한 배열 길이 (올림 처리)
        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            int start = i * n;
            int end = Math.min(start + n, len); // 범위 초과 방지
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
