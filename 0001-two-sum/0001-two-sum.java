class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int j = target - nums[i];
            if(mp.containsKey(j))
            {
                return new int[]{mp.get(j),i};
            }

            else
            {
            mp.put(nums[i],i);
            }
        }
      
      return null;
    }
}