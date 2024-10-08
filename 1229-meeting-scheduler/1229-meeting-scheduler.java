class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
    Arrays.sort(slots1,(a,b)->(a[0]-b[0]));
    Arrays.sort(slots2,(a,b)->(a[0]-b[0]));
    
        int pointer1=0;
        int pointer2=0;
        
        while(pointer1 < slots1.length && pointer2 < slots2.length)
        {
      
            int leftpointer = Math.max(slots1[pointer1][0],slots2[pointer2][0]); 
            int rightpointer = Math.min(slots1[pointer1][1],slots2[pointer2][1]);
            
            System.out.print(leftpointer);
            System.out.print(" ");
            System.out.print(rightpointer);
            System.out.print(" ");
                if(rightpointer - leftpointer >= duration)
                   {
                      return  new ArrayList<Integer> (Arrays.asList(leftpointer,leftpointer+duration));
                   }
                if(slots2[pointer2][1] > slots1[pointer1][1])
                    {
                        pointer1++;
                    }
                    else
                    {
                        pointer2++;
                    }
            }
                 return new ArrayList<Integer>();   
    }
}
