class Solution {
    public int findDuplicate(int[] nums) {
    int n=nums.length;
    HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<n;i++){
           if(hm.containsKey(nums[i])){
               return nums[i];
           }else{
               hm.put(nums[i],1);
           }
       }
        return -1;
}
}