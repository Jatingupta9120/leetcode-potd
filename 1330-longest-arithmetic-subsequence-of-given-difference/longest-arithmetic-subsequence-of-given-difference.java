class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int previous = current - difference;
            
            if (map.containsKey(previous)) {
                int count = map.get(previous);
                map.put(current, count + 1);
                max = Math.max(max, count + 1);
            } else {
                map.put(current, 1);
            }
        }
        return max;
    }
}