class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] LDS=new int[n];
        int[] LIS=new int[n];
        Arrays.fill(LDS,1);
        Arrays.fill(LIS,1);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    LIS[i]=Math.max(LIS[i],LIS[j]+1);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j]){
                    LDS[i]=Math.max(LDS[i],LDS[j]+1);
                }
            }
        }
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(LIS[i]>1 && LDS[i]>1){
                ans=Math.min(ans,n-LIS[i]-LDS[i]+1);
            }
        }
        return ans;
    
    }
}