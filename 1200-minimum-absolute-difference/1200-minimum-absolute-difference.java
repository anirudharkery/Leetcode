class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int curr_min = min;
        
        for(int i=0;i<arr.length-1;i++)
        {
            
                curr_min = arr[i+1]-arr[i]; 
            
            
            if(curr_min == min)
            {
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if(curr_min < min)
            {
                result.clear();
                result.add(Arrays.asList(arr[i],arr[i+1])); 
                min = curr_min;   
            }
        }
        return result;
        
    }
}