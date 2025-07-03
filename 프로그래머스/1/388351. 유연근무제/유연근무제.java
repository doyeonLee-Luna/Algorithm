class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int n = schedules.length;

        for (int i = 0; i < n; i++) {
            int limitTime = addTenMinutes(schedules[i]);
            boolean isAllOnTime = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;

                // 평일(월~금)만 체크
                if (day >= 1 && day <= 5) {
                    if (timelogs[i][j] > limitTime) {
                        isAllOnTime = false;
                        break;
                    }
                }
            }

            if (isAllOnTime) answer++;
        }

        return answer;
    }

    // 출근 희망 시각에 10분을 더하는 메서드
    private int addTenMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;

        minute += 10;
        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }

        return hour * 100 + minute;
    }
}
