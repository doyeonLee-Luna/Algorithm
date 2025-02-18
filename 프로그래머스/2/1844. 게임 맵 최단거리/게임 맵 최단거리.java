import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {1, -1, 0, 0}; // 동, 서
    static int[] dy = {0, 0, 1, -1}; // 남, 북

    static int n, m; // 맵 크기
    static int[][] map; // 맵의 상태(0: 벽, 1: 길)
    static boolean[][] visited; // 방문 여부 체크

    public int solution(int[][] maps) {
        n = maps.length; // 행 크기
        m = maps[0].length; // 열 크기
        map = maps;
        visited = new boolean[n][m];

        // BFS를 위한 큐 생성
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // (0, 0) 위치에서 시작, 거리 1 (시작칸은 1로 시작)

        visited[0][0] = true;

        // BFS 시작
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2];

            // 목표 위치에 도달하면 거리 반환
            if (r == n - 1 && c == m - 1) {
                return dist;
            }

            // 4방향으로 탐색
            for (int i = 0; i < 4; i++) {
                int newR = r + dy[i];
                int newC = c + dx[i];

                // 범위 내에 있고, 벽이 아니며, 방문하지 않은 곳으로만 이동
                if (newR >= 0 && newR < n && newC >= 0 && newC < m && map[newR][newC] == 1 && !visited[newR][newC]) {
                    visited[newR][newC] = true;
                    queue.offer(new int[]{newR, newC, dist + 1}); // 새로운 위치로 이동하고, 거리는 +1
                }
            }
        }

        // 목표 위치에 도달할 수 없으면 -1 반환
        return -1;
    }
}
