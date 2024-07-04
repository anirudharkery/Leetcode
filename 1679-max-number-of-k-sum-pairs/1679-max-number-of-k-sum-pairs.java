class Solution {
    public int maxOperations(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int current = nums[i];
            int complement = k-current;
            
            if(mp.getOrDefault(complement,0) > 0)
            {
                mp.put(complement,mp.getOrDefault(complement,0)-1);
                count++;
            }
            else
            {
               mp.put(current,mp.getOrDefault(current,0)+1);
            }
        }
        return count;
    }
}