import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름과 그리움 점수를 매핑할 HashMap 생성
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        // 결과 배열 생성
        int[] answer = new int[photo.length];

        // 각 사진마다 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                sum += scoreMap.getOrDefault(person, 0); // 존재하지 않으면 0점
            }
            answer[i] = sum;
        }

        return answer;
    }
}
