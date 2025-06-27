import java.util.*;

class Solution {
        public String solution(String my_string) {

            StringBuilder builder = new StringBuilder();
            
            String lower = my_string.toLowerCase();
            
            char[] chars = lower.toCharArray();
            
            Arrays.sort(chars);
            
            return new String(chars);
        }
    }