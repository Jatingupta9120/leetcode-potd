import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int num=nums[i];
        int moreneeded=target-num;
        if(hm.containsKey(moreneeded)){
            arr[0]=hm.get(moreneeded);
            arr[1]=i;
            return arr;
        }
        hm.put(nums[i],i);
       }
        return arr;
    }
}