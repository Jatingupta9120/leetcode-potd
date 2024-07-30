class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int ct=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(!st.isEmpty()&&s.charAt(i)=='a'&&st.peek()=='b'){
                st.pop();
                ct++;
            }else{
                st.push((int)s.charAt(i));
            }
        }
        return ct;
    }
}