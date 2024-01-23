class Solution {
    public int maxLength(List<String> arr) {
      List<String>anslist=new ArrayList<>();
        int ans=0;
        anslist.add("");
        for(String str:arr){
            if(!checkuniquecharstring(str))continue;
            List<String>newanslist=new ArrayList<>();
            for(String candidate:anslist){
                String temp=candidate+str;
                if(checkuniquecharstring(temp)){
                    newanslist.add(temp);
                    ans=Math.max(ans,temp.length());
                }
            }
            anslist.addAll(newanslist);
        }
        return ans;
    }
    public boolean checkuniquecharstring(String str){
        if(str.length()>26){
            return false;
        }
        int freq[]=new int[26];
        char arr[]=str.toCharArray();
        for(char ch:arr){
            freq[ch-'a']++;
            if(freq[ch-'a']>1)return false;
        }
        return true;
    }
}