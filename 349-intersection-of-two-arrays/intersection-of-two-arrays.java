class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer>hm=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int num:nums1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int i:nums2){
            if(hm.containsKey(i)){
                ans.add(i);
                 hm.remove(i);
            }
        }
        int intersection[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            intersection[i]=ans.get(i);
        }
        return intersection;
    }
}