class Solution {
    public int countKDifference(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        
        int res=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]+k))
            {
                res +=  mp.get(nums[i]+k);
            }
            if(mp.containsKey(nums[i]-k))
            {
                res +=  mp.get(nums[i]-k);
            }
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        
        return res;
        
    }
}
