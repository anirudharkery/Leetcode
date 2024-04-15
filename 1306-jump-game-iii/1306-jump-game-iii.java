class Solution {
    public boolean helper(int[] arr,int idx,Set<Integer> set)
    {
        if(idx < 0 || idx >= arr.length)
            return false;
        
         if(set.contains(idx))
                return false;
            
            if(arr[idx]==0)
                return true;
            
            set.add(idx);
        
        return (helper(arr,arr[idx]+idx,set) || helper(arr,idx-arr[idx],set));
        
    }
    public boolean canReach(int[] arr, int start) {
        
        return helper(arr,start,new HashSet<>());
    }
}