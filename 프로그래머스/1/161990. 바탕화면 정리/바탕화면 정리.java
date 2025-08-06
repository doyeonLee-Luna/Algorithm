import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int rows = wallpaper.length;
        int cols = wallpaper[0].length();
        
        int lux = rows;
        int luy = cols;
        int rdx = 0;
        int rdy = 0;
        
        for ( int i = 0; i < rows; i++) {
            for ( int j = 0; j < cols; j++) {
                if ( wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i+1);
                    rdy = Math.max(rdy, j+1);
                }
            }
        }
        
        return new int[] {lux, luy, rdx, rdy};
    }
}