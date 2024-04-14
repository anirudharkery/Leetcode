class Solution {
    public int longestMountain(int[] arr) {
        int base=0;
        int ans=0;
        int N = arr.length;
        
         while(base < N)
         {
              int end=base;
            if(end +1 < N && arr[end] < arr[end+1])
            {
                while(end +1 < N && arr[end] < arr[end+1]) end++;
                
                if(end +1 < N && arr[end] > arr[end+1])
                {
                      while(end +1 < N && arr[end] > arr[end+1]) end++;

                    ans =   Math.max(ans,end-base+1);
                }
            }
             base = Math.max(base+1,end);
         }
       
            return ans;
    }
}