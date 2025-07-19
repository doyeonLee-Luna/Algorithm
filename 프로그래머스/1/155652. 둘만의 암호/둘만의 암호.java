import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        // skip에 포함되지 않은 알파벳 리스트 만들기
        List<Character> available = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                available.add(c);
            }
        }

        // 각 문자 변환
        for (char ch : s.toCharArray()) {
            int currentIndex = available.indexOf(ch);
            int newIndex = (currentIndex + index) % available.size();
            answer.append(available.get(newIndex));
        }

        return answer.toString();
    }
}
