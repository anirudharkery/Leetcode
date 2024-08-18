class Solution {
    public int secondsToRemoveOccurrences(String s) {
        
        boolean change = true;
        int count=0;
        char[] ch = s.toCharArray();
        
        while(change)
        {
            change = false;
            for(int i=0;i<ch.length-1;i++)
            {
                if(ch[i] == '0' && ch[i+1] == '1')
                {
                    ch[i+1] = '0';
                    ch[i] = '1';
                       i++;
                change=true;         
            }
            }
            if(change)
            {
                count++;
            }
           
        }
        return count;
    }
}