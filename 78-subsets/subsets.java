class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        explore(nums,0,curr,res);
        return res;
    }
    public void explore(int[] nums, int index, List<Integer> curr, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // Include the current element
        curr.add(nums[index]);
        explore(nums, index + 1, curr, result);
        curr.remove(curr.size() - 1); // Backtrack

        // Exclude the current element
        explore(nums, index + 1, curr, result);
    }
}