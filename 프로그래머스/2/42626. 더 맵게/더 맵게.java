import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for ( int sco : scoville) {
            pq.offer(sco);
        }
        
        int count = 0;
        
        while ( pq.size() >= 2 ) {
            if ( pq.peek() >= K ) {
                return count;
            }
            
            int a = pq.poll();
            int b = pq.poll();
            int mix = a + ( b * 2 );
            
            pq.offer(mix);
            count++;
        }
        
        return pq.peek() >= K ? count : -1;
    }
}