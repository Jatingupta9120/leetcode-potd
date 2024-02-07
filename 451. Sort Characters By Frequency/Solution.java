class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
         hm.put(ch,hm.getOrDefault(ch,0)+1);   
        }
        PriorityQueue<Character>maxheap=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        maxheap.addAll(hm.keySet());
        StringBuilder sb=new StringBuilder();
        while(!maxheap.isEmpty()){
            char ch=maxheap.remove();
           int ct=hm.get(ch);
            while(ct!=0){
                sb.append(ch);
                ct--;
                
            }
        }
        return sb.toString();
    }
}