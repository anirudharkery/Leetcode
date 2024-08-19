class Solution {
            static int mod = (int)Math.pow(10,9)+7;

    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        
        int n = nums.length;
        int[] count = new int[n];
        long sum=0;
        
        for(int[] request : requests)
        {
            int start = request[0];
            int end = request[1]+1;
            count[start]++;
            if(end < n)
            {
                count[end]--;
            }
        }
        for(int i=1;i<n;i++)
        {
            count[i] += count[i-1]; 
        }
        
        Arrays.sort(nums);
        Arrays.sort(count);
        
        for(int i=0;i<n;i++)
        {
            long val = (long) count[i] * (long) nums[i];
            sum+=val;
        }
        return (int) (sum%mod);
    }
}