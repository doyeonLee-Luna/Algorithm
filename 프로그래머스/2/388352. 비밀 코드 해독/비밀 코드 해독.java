import java.util.*;

public class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        int count = 0;

        // 1부터 n까지 숫자 중 5개를 고르는 모든 조합
        List<int[]> combinations = generateCombinations(n, 5);

        // 각 조합마다 시도 결과와 일치하는지 확인
        for (int[] comb : combinations) {
            boolean isValid = true;
            for (int i = 0; i < q.length; i++) {
                int match = 0;
                for (int num : comb) {
                    for (int val : q[i]) {
                        if (num == val) {
                            match++;
                            break;
                        }
                    }
                }
                if (match != ans[i]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) count++;
        }

        return count;
    }

    // 조합 생성기 (n개 중 r개를 뽑는 모든 조합을 반환)
    private List<int[]> generateCombinations(int n, int r) {
        List<int[]> result = new ArrayList<>();
        combinationHelper(result, new int[r], 1, 0, n, r);
        return result;
    }

    private void combinationHelper(List<int[]> result, int[] temp, int start, int depth, int n, int r) {
        if (depth == r) {
            result.add(temp.clone());
            return;
        }
        for (int i = start; i <= n - (r - depth) + 1; i++) {
            temp[depth] = i;
            combinationHelper(result, temp, i + 1, depth + 1, n, r);
        }
    }
}
