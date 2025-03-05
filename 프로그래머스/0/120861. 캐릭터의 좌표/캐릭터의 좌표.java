import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        HashMap<String, int[]> hashMap = new HashMap<>();
        
        hashMap.put("left", new int[] { -1, 0});
        hashMap.put("right", new int[] { 1, 0});
        hashMap.put("up", new int[] { 0, 1});
        hashMap.put("down", new int[] { 0, -1});
        
        for ( String key : keyinput) {
            int[] move = hashMap.get(key);
            int newX = x + move[0];
            int newY = y + move[1];
            
            if(Math.abs(newX) <= maxX && Math.abs(newY) <= maxY) {
                x = newX;
                y = newY;
            }
        }
        
        return new int[] {x, y};

    }
}