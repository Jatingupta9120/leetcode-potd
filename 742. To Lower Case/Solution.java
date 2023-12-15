class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int ascii=(int)c;
            if(65<=ascii&&90>=ascii){
                ascii+=32;
               res+=(char) ascii;
               continue; 
            }
            res+=c;
     }
        return res;
    }
}