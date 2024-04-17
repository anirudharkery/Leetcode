class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        
        double[][][] dp = new double[k+1][n][n];
        double probability=0.0;
        dp[0][row][column] = 1.0;
        int[][] directions ={{1,2},{-1,2},{1,-2},{-1,-2},{-2,1},{2,-1},{2,1},{-2,-1}};
        
        for(int moves=1;moves<=k;moves++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int[] direction : directions)
                    {
                        int prev_I = i - direction[0];
                        int prev_J = j - direction[1];
                        
                        if((prev_I >= 0 && prev_I < n) && (prev_J >= 0 && prev_J < n))
                        {
                        dp[moves][i][j] += dp[moves-1][prev_I][prev_J] / 8.0;
                        }
                        
                    }
                }
            }
        }
        
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                probability += dp[k][i][j];
            }
         }
        return probability; 
        
    }
}