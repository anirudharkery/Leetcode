class Solution {
    public int maxVowels(String s, int k) {
        
        int count=0;
        
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            
        }
        int current_count = count;
        int max_vowel = current_count;
        
        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i-k)))
            {
                current_count = current_count-1;
            }
            
             if(isVowel(s.charAt(i)))
            {
                current_count = current_count+1;
                 max_vowel = Math.max(max_vowel,current_count);
            }
            
        }
        return max_vowel;
    }
    
    public boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}