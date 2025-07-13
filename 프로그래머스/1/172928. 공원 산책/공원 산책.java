class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int x = 0, y = 0;

        // 시작 위치 찾기
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        // 방향 정의
        int[] dx = {-1, 1, 0, 0}; // N, S, W, E
        int[] dy = {0, 0, -1, 1};
        String[] dir = {"N", "S", "W", "E"};

        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);

            int dirIndex = -1;
            for (int i = 0; i < 4; i++) {
                if (dir[i].equals(direction)) {
                    dirIndex = i;
                    break;
                }
            }

            boolean isValid = true;
            int nx = x;
            int ny = y;

            for (int i = 1; i <= distance; i++) {
                int tx = x + dx[dirIndex] * i;
                int ty = y + dy[dirIndex] * i;

                if (tx < 0 || tx >= h || ty < 0 || ty >= w || park[tx].charAt(ty) == 'X') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                x += dx[dirIndex] * distance;
                y += dy[dirIndex] * distance;
            }
        }

        return new int[]{x, y};
    }
}
