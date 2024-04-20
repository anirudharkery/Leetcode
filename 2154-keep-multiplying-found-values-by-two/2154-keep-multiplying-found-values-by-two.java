class Solution {
    public int findFinalValue(int[] nums, int original) {
//         Arrays.sort(nums);
//         int val=original;
//         Map<Integer,Integer> mp = new HashMap<>();
        
            
//         for(int i=0;i<nums.length;i++)
//         {
//             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
//         }
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(mp.containsKey(val))
//             {
//                 val = val*2;
//             }
//         }
//         return val;
        HashSet<Integer> has= new HashSet<>(nums.length);
for (int i=0;i<=nums.length-1;i++)
	has.add(nums[i]);
for (int i=0;i<=nums.length-1;i++) {
	if (!has.contains(original))
		break;
	original = original * 2;
}
return original; 
        
    }
}