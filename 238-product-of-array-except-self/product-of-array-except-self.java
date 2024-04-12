class Solution {
    public int[] productExceptSelf(int[] nums) {
     int product=0;
        int n=nums.length;
     int productwithouzero=1;
        for(int i:nums){
            if(i==0){
                product++;
            }else{
                productwithouzero*=i;
            }
        }
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                if(product>0){
                    result[i]=0;
                }
                else{
                result[i]=productwithouzero/nums[i];
                }
            }
            else{
                if(product>1){
                    result[i]=0;
                }else{
                    result[i]=productwithouzero;
                }
            }
        }
        return result;
    }
}