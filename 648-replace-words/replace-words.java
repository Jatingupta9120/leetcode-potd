class Solution {
    
    public String findroot(String word,Set<String>set){
        for(int i=1;i<=word.length();i++){
        String root=word.substring(0,i);
            if(set.contains(root)){
                return root;
            }
        }
        return word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
     //convert dict into set
        Set<String>set=new HashSet<>(dictionary);
       
        //sb to store and return as final ans
        
        String[] words = sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            sb.append(findroot(word, set)).append(" ");
        }
        return sb.toString().trim();
        
    }
    
}