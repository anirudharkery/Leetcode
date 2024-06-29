class Solution {
    public int compress(char[] chars) {
        
        int i=0;
        int res=0;
        
        while(i < chars.length)
        {
                    int charslength=1;

            while(i+charslength < chars.length && chars[i+charslength] == chars[i])
            {
                charslength++;
            }
            
            chars[res++] = chars[i];
            
            if(charslength > 1)
            {
                for(char c : Integer.toString(charslength).toCharArray())
                    chars[res++] = c;
            }
            i += charslength;
        }
        return res;
    }
}