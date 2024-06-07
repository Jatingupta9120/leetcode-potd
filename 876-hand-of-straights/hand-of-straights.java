class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0)return false;//checkone for if groupsize%n!=0 return false;
        TreeMap<Integer,Integer>tm=new TreeMap<>();//we are creating a map and storing all values,freq in sorted order
        for(int i:hand){
            tm.put(i,tm.getOrDefault(i,0)+1);
        }
        while(!tm.isEmpty()){//we are taking values from map
            
            int curr=tm.firstKey();//getting 1st element from map 
            for(int i=0;i<groupSize;i++){//loop for groupsize like curr=1 and so remaining 2(curr+i) checkif it exist or not 
                int val=curr+i;
                if(!tm.containsKey(val)){
                   return false;// if not return false;
                }
                tm.put(val,tm.get(val)-1);
                if(tm.get(val)==0){
                    tm.remove(val);
                };
            }
        }
        return true;
        
    }
}