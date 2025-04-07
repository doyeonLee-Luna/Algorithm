class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // video_len, pos, op_start, op_end는 "mm:ss" 형식
        // 이를 초 단위로 변환해서 연산하고 나중에 다시 "mm:ss" 형식으로 변환
        
        // video_len, pos, op_start, op_end를 초로 변환
        int video_len_sec = timeToSeconds(video_len);
        int pos_sec = timeToSeconds(pos);
        int op_start_sec = timeToSeconds(op_start);
        int op_end_sec = timeToSeconds(op_end);

        // 오프닝 구간 건너뛰기
            if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
                pos_sec = op_end_sec; // 오프닝 끝으로 이동
            }
        // 명령을 처리
        for (String command : commands) {
            if (command.equals("prev")) {
                // 10초 전으로 이동
                pos_sec -= 10;
                if (pos_sec < 0) {
                    pos_sec = 0; // 동영상 처음으로 이동
                }
            } else if (command.equals("next")) {
                // 10초 후로 이동
                pos_sec += 10;
                if (pos_sec > video_len_sec) {
                    pos_sec = video_len_sec; // 동영상 끝으로 이동
                }
            }

            // 오프닝 구간 건너뛰기
            if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
                pos_sec = op_end_sec; // 오프닝 끝으로 이동
            }
        }

        // 결과를 "mm:ss" 형식으로 변환
        return secondsToTime(pos_sec);
    }

    // "mm:ss" 형식의 시간을 초 단위로 변환하는 함수
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // 초 단위의 시간을 "mm:ss" 형식으로 변환하는 함수
    private String secondsToTime(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }
}
