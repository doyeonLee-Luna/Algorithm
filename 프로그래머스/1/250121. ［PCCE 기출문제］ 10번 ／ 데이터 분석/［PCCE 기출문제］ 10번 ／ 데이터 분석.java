import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 어떤 인덱스를 비교/정렬에 쓸지 맵으로 정의
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int extIndex = map.get(ext);
        int sortIndex = map.get(sort_by);

        // 조건에 맞는 데이터만 필터링
        List<int[]> filtered = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filtered.add(row);
            }
        }

        // 정렬 기준에 따라 오름차순 정렬
        filtered.sort(Comparator.comparingInt(arr -> arr[sortIndex]));

        // List -> 배열 변환
        int[][] answer = new int[filtered.size()][4];
        for (int i = 0; i < filtered.size(); i++) {
            answer[i] = filtered.get(i);
        }

        return answer;
    }
}
