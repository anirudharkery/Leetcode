class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int dp[] = new int[nums.length];
        
        
        Arrays.fill(dp,1);
        
        int max =0;
        for(int i = 0;i< nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i] > nums[j])
                {
                     dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        
        int longest = 0;
        
        for(int lng : dp )
           longest = Math.max(lng,longest);
            return longest;
        
    }
}