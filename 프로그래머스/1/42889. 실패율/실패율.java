import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 1) 각 스테이지에 머물러 있는 사용자 수 집계
        int[] challenger = new int[N + 2];              // N+1까지 인덱스를 쓰기 위해
        for (int s : stages) {
            challenger[s]++;
        }

        // 2) 스테이지별 실패율 계산
        Map<Integer, Double> fails = new HashMap<>();
        double total = stages.length;                   // 아직 도전 중인(=도달한) 전체 사용자 수
        for (int level = 1; level <= N; level++) {
            if (total == 0) {
                // 더 이상 도달한 사용자 없으면 실패율 0
                fails.put(level, 0.0);
            } else {
                // 실패율 = (머물러 있는 사람) / (도달한 사람)
                double rate = challenger[level] / total;
                fails.put(level, rate);
                total -= challenger[level];             // 다음 레벨 도달자 수 갱신
            }
        }

        // 3) 실패율 내림차순, 스테이지 오름차순 정렬
        return fails.entrySet().stream()
            .sorted((e1, e2) -> {
                int cmp = Double.compare(e2.getValue(), e1.getValue());  // 실패율 내림차순
                if (cmp != 0) return cmp;
                return Integer.compare(e1.getKey(), e2.getKey());        // 같은 실패율이면 스테이지 오름차순
            })
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
