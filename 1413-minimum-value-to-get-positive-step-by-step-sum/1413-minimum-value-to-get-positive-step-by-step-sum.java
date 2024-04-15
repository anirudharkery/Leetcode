class Solution {
    public int minStartValue(int[] nums) {
       int startvalue=1;
        
        while(true)
        {
            int sum = startvalue;
            boolean isValue = true;

            for(int num : nums)
            {
                sum += num;
                if(sum < 1)
                {
                    isValue = false;
                    break;
                }
            }
            if(isValue)
            {
                return startvalue;
            }
            else
            {
                startvalue = startvalue+1;
            }
        }
    }
}