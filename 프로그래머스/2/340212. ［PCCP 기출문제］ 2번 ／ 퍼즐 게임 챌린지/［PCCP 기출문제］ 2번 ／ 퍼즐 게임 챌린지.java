class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1;
        int right = 100_000;
        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canSolveAll(diffs, times, limit, mid)) {
                answer = mid;  // 더 낮은 숙련도로 가능한지 확인
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private boolean canSolveAll(int[] diffs, int[] times, long limit, int level) {
        long totalTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            if (i == 0 || diffs[i] <= level) {
                totalTime += times[i];
            } else {
                int mistakes = diffs[i] - level;
                long penalty = (long)(times[i] + times[i - 1]) * mistakes + times[i];
                totalTime += penalty;
            }

            if (totalTime > limit) return false; // 시간 초과 시 조기 종료
        }

        return true;
    }
}
