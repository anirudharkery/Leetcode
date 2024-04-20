class Solution {
    public int findFinalValue(int[] nums, int original) {
     
       
        Map<Integer,Integer> mp = new HashMap<>();
        
            
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(original))
            {
                original = original*2;
            }
        }
        return original;

        
    }
}