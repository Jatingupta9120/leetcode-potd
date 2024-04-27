class Solution {
    int countSteps(int ringIndex, int i, int n) {
        int dist       = Math.abs(i - ringIndex);
        int wrapAround =  n - dist;
        
        return Math.min(dist, wrapAround);
    }
    
    public int findRotateSteps(String ring, String key) {
        int n = ring.length();
        int m = key.length(); 
        
        int[][] t = new int[n+1][m+1];
        //t[ringIndex][keyIndex] = minimum number of steps to get key[keyIndex] when the ring[ringIndex] is aligned with the "12:00" position.
        
        // Base case: when all key characters are done (we reached index n).
        for(int ringIndex = 0; ringIndex < n; ringIndex++) {
            t[ringIndex][m] = 0;
        }
    
        for(int keyIndex = m-1; keyIndex >= 0; keyIndex--) {
            for(int ringIndex = 0; ringIndex < n; ringIndex++) {
                
                int result = Integer.MAX_VALUE;
                for (int i = 0; i < ring.length(); i++) {
                    if (ring.charAt(i) == key.charAt(keyIndex)) {
                        int totalSteps = countSteps(ringIndex, i, ring.length()) + 1 +
                                            t[i][keyIndex + 1];
                        result = Math.min(result, totalSteps);
                    }
                }
                t[ringIndex][keyIndex] = result;
            }
        }
        return t[0][0];
    }
}