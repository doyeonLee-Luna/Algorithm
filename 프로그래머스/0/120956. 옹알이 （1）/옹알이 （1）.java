class Solution {
    public int solution(String[] babbling) {
        String[] speakable = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            String temp = word;
            boolean isValid = true;

            for (String s : speakable) {
                // 각 발음이 두 번 이상 등장하면 안 됨
                if (temp.indexOf(s) != -1 && temp.indexOf(s) != temp.lastIndexOf(s)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (String s : speakable) {
                    temp = temp.replace(s, " ");
                }

                // 남는 문자가 없다면 유효한 발음
                if (temp.replace(" ", "").isEmpty()) {
                    count++;
                }
            }
        }

        return count;
    }
}
