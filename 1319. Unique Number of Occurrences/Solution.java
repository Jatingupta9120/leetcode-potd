class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer>hm=new HashMap<>();
     for(int i=0;i<arr.length;i++){
         if(hm.containsKey(arr[i])){
             hm.put(arr[i],hm.get(arr[i])+1);
         }else{
             hm.put(arr[i],1);
         }

        } 
        HashSet<Integer>hashset=new HashSet<>();
        boolean flag=true;
        for(Map.Entry<Integer,Integer>mpele:hm.entrySet()) {
            if(!hashset.add(mpele.getValue())){
                flag=false;
            }
        } 
        return flag;
    }
}