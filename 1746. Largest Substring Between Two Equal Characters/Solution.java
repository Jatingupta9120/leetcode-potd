class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxlen=-1;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                maxlen=Math.max(maxlen,i-hm.get(c)-1);
            }else{
                hm.put(c,i);
            }
        }
        return maxlen;
    }
}