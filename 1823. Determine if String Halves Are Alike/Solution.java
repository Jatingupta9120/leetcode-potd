class Solution {
   public boolean halvesAreAlike(String s) {
      int  f_vowel = 0;
      int  s_vowel = 0;
      int n = s.length();
      for(int i = 0 ; i < (n/2) ; i++){
          char ch = s.charAt(i);
          if(isVowel(ch))
            f_vowel++;
      }
      for(int i = (n/2) ; i < n ; i++){
          char ch = s.charAt(i);
          if(isVowel(ch))
            s_vowel++;
      }
      return f_vowel == s_vowel;
    }
    public boolean isVowel(char c){
        if(c == 'a' || c == 'i' || c=='o' || c == 'u' || c=='e' ||
      c == 'A' || c == 'I' || c=='O' || c == 'U' || c=='E')
            return true;
        return false;
    }
}