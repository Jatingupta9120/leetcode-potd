class Solution {
    private void functionsub(int idx,int nums[],List<Integer>ds,List<List<Integer>>anslist){
        anslist.add(new ArrayList<>(ds));
        for(int i=idx;i<nums.length;i++){
            if(i!=idx&&nums[i]==nums[i-1])continue;
                ds.add(nums[i]);
            
            functionsub(i+1,nums,ds,anslist);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>>anslist=new ArrayList<>();
        functionsub(0,nums,new ArrayList<>(),anslist);
        return anslist;
    }
}