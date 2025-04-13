import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        // 매트 크기 내림차순
        Arrays.sort(mats);
        
        // 공원 전체 크기
        int x = park.length;
        int y = park[0].length; 
        
        // 가장 큰 돗자리 부터 
        for( int m = mats.length - 1; m >=0; m--) {
            int size = mats[m];
            
            for ( int i = 0; i <= x-size; i++) {
                for ( int j = 0; j <= y-size; j++) {
                    if ( can(park, i, j, size)) {
                        return size;
                    }
                }
            }
        }
        
        return -1;
    }
        
        // 돗자리가 크기 3인 경우 i+2, j+2 까지 -1인지 확인
       private boolean can(String[][] park, int x, int y, int size) {
           for(int k = x; k < x + size; k++) {
               for ( int l = y; l < y + size; l++ ) {
                   if ( !park[k][l].equals("-1")) {
                       return false;
                   }
               }
           }
           
           return true;
       }
    }