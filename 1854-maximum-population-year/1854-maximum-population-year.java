class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int[] year = new int[2051];
        
        for(int[] log : logs)
        {
            year[log[0]]++;
            year[log[1]]--;

        }
        
        int maxyear = year[1950];
         int yea = 1950;
        
        for(int i=1951;i<2050;i++)
        {
           year[i] += year[i-1];
            
            while(year[i] > maxyear)
            {
                maxyear=year[i];
                yea=i;
            }
        }
        return yea;
    }
}