class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        int n = words.length;
        int[] prefix = new int[n+1];
        int[] res = new int[queries.length];
        
        for(int i=0;i< n;i++)
        {
          
            prefix[i+1] = prefix[i] + (vowelchar(words[i]) ? 1:0);
            
        }
        
        for(int i=0;i<queries.length;i++)
        {
              int start= queries[i][0];
               int end= queries[i][1];
            
            res[i] = prefix[end+1] - prefix[start];
        }
        
       
        
        return res;
    }
    
    public static boolean vowelchar(String s)
    {
        char st = s.charAt(0);
        char ed = s.charAt(s.length()-1);
        return isvowel(st) && isvowel(ed);
    }
    
    public static boolean isvowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}

    

