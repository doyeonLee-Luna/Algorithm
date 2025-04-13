class Solution {
    public int solution(int[] wallet, int[] bill) {

        int w1 = wallet[0];
        int w2 = wallet[1];

        int b1 = bill[0];
        int b2 = bill[1];

        int answer = 0;

        while (true) {
            // 지폐가 지갑에 들어가는지 확인 (회전 포함)
            if ((b1 <= w1 && b2 <= w2) || (b2 <= w1 && b1 <= w2)) {
                return answer;
            }

            // 긴 쪽을 반으로 접기
            if (b1 >= b2) {
                b1 = b1 / 2;
            } else {
                b2 = b2 / 2;
            }

            answer++;
        }
    }
}
