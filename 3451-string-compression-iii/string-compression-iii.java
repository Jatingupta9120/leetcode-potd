class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int n=word.length();
        for(int i=0;i<n;){
            char ch=word.charAt(i);
            int ct=0;
            while(i<n&&word.charAt(i)==ch&&ct<9){
                ct++;
                i++;
            }
            sb.append(ct).append(ch);
        }
        return sb.toString();
    }
}
