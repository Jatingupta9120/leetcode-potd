class Solution {
    public boolean makeEqual(String[] words) {
     int n=words.length;
     Map<Character,Integer>hm=new HashMap<>();
     for(String word:words){
         for(char ch:word.toCharArray()){
             hm.put(ch,hm.getOrDefault(ch,0)+1);
         }
     } 
     for(int value:hm.values()){
         if(value%n!=0){
             return false;
         }
     }  
     return true;
    }
}