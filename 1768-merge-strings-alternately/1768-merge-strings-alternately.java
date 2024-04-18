class Solution {
    public String mergeAlternately(String word1, String word2) {
        
      int i=0;
      int j=0;

      int m = word1.length();
      int n = word2.length();
     
      String res = "";
      
      while(i < m && j < n)
      {
          res += word1.charAt(i);
          i++;

          res += word2.charAt(j);
          j++;
      }
        
        while(i < m)
        {
          res += word1.charAt(i);
          i++;

        }

         while(j < n)
        {
          res += word2.charAt(j);
          j++;
        }


        return res;
    }
}