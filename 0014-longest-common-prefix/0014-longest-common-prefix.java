class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String longestCommonPrefix="";
        int index=0;
        
        if(strs.length==0)
        {
            return longestCommonPrefix;
        }
        
        for(char c: strs[0].toCharArray())
        {
            for(int i=1;i<strs.length;i++)
            {
                if(index >= strs[i].length() || c != strs[i].charAt(index))
                    return longestCommonPrefix;
            }
            index++;
            longestCommonPrefix=longestCommonPrefix+c;
        }
        return longestCommonPrefix;
        
        
    }
}