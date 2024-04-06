class Solution {
    public String minRemoveToMakeValid(String s) {
        HashSet<Integer>remove=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(st.isEmpty()){
                    remove.add(i);
                }else{
                    st.pop();
                }
              
            }
            
            
        }
        while(!st.isEmpty()){
            remove.add(st.pop());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!remove.contains(i)){
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
        
    }
}