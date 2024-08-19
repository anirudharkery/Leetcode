class Solution {
    public int findInteger(int k, int digit1, int digit2) {
        
        if(digit1 == 0 && digit2 == 0)
            return -1;
        
        int res=-1;
        int res1,res2;
        
    
        
        if(digit1 != 0)
        {
            res1 = findDFS(k,digit1,digit2,digit1);
            res = res1;
        }
         if(digit2 != 0)
        {
            res2 = findDFS(k,digit1,digit2,digit2);
                if(res2 != -1)
                 res = res == -1 ? res2 : Math.min(res, res2);
        }
        return res;
    }
    
    private int findDFS(int k,int digit1,int digit2,int currNum) {
            int res =-1;
        int res1,res2;
           
        if(currNum > k && currNum%k==0)
        {
            return currNum;
        }
    
        if((Integer.MAX_VALUE-digit1)/10 >= currNum)
        {
            res1 = findDFS(k,digit1,digit2,currNum*10+digit1);
            res = res1;
        }
          if(digit1 != digit2 && ((Integer.MAX_VALUE-digit2)/10 >= currNum))
        {
            res2 = findDFS(k,digit1,digit2,currNum*10+digit2);
            if(res2 > 0)
              res = res == -1? res2:Math.min(res,res2);
        }
        return res;
    }
}
