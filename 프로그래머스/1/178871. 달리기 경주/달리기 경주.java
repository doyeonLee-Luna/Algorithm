import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
       Map<String, Integer> playersToIndex = new HashMap<>();
            for ( int i = 0; i < players.length; i++) {
                playersToIndex.put(players[i], i);
                
                
            }
        
        for ( String called : callings) {
            int currentIndex = playersToIndex.get(called);
            int frontIndex = currentIndex - 1;
            
                String frontPlayer = players[frontIndex]; 
                
                players[frontIndex] = called;
                players[currentIndex] = frontPlayer;
            
                playersToIndex.put(called, frontIndex);
                playersToIndex.put(frontPlayer, currentIndex);
                
            
        }
        
        
        return players;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         Map<String, Integer> playersToIndex = new HashMap<>();
//         for ( int i = 0; i < players.length; i++) {
//             playersToIndex.put(players[i], i);
//         }
        
//         for ( String called : callings) {
//             int currentIndex = playersToIndex.get(called);
//             int frontIndex = currentIndex - 1;
            
//             String frontPlayer = players[frontIndex];
            
//             players[frontIndex] = called;
//             players[currentIndex] = frontPlayer;
            
//             playersToIndex.put(called, frontIndex);
//             playersToIndex.put(frontPlayer, currentIndex);
//         }
        
//         return players;
        
        
        
    }
}