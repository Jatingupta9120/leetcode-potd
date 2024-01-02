class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int []mp=new int [nums.length+1];
        ArrayList<List<Integer>>ans=new ArrayList<>();
        for(int num:nums){
            int freq=mp[num];
            if(freq==ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(freq).add(num);
            mp[num]++;
        }
        return ans;
    }
}