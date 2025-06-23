public class Solution {
    public static int solution(String A, String B) {
        if (A.length() != B.length()) {
            return -1; // 길이가 다르면 절대 될 수 없음
        }

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return i;
            }
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
        }

        return -1;
    }

    // 테스트용 main 메소드
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell")); // 1
        System.out.println(solution("apple", "elppa")); // -1
        System.out.println(solution("atat", "tata"));   // 1
        System.out.println(solution("abc", "abc"));     // 0
    }
}
