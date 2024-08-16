class Solution {
    
    public int vowelStrings(String[] words, int left, int right) {
        
        int count=0;
        
        while(left <= right)
        {
            int len = words[left].length()-1;
            char st = words[left].charAt(0);
            char en = words[left].charAt(len);
            if(st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u')
            {
                if(en == 'a' || en == 'e' || en == 'i' || en == 'o' || en == 'u')
                {
                    count++;
                }
            }
            left++;
        }
        return count;
    }
  }
