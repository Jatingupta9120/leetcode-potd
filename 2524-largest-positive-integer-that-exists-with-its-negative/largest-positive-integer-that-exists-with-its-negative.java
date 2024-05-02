class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int largest=-1;
        for(int i:nums){
            set.add(i);
            
        }
        for(int i:nums){
            if(set.contains(-i)){
                largest=Math.max(largest,Math.abs(i));
            }
        }
        return largest!=-1?largest:-1;
    }
}