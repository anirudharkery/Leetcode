class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int i = 0;
        int j=0;
        
        int mn = Integer.MAX_VALUE;

        while(j < nums.length)
        {
              sum = sum + nums[j];
           
            while(sum >= target)
            {
                sum = sum - nums[i];
                mn = Math.min(j-i+1,mn);
                i++;
            }

          
            j++;
        }
        if(mn==Integer.MAX_VALUE){
            return 0;
        }
        return mn;
    }
}