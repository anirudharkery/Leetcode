// class Solution {
//     public int countKDifference(int[] nums, int k) {
        
//         Map<Integer,Integer> mp = new HashMap<>();
        
//         int res=0;
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(mp.containsKey(nums[i]+k))
//             {
//                 res +=  mp.get(nums[i]+k);
//             }
//             else if(mp.containsKey(nums[i]-k))
//             {
//                 res +=  mp.get(nums[i]-k);
//             }
//             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
//         }
        
//         return res;
        
//     }
// }
class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                res+= map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)){
                res+= map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        
        return res;
    }
}