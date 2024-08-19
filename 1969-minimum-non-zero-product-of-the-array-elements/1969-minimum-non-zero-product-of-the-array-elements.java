class Solution 
{
    int mod = 1000_000_007;
    public int minNonZeroProduct(int p) 
    {
        if(p==1) 
        {
        return 1;
        }
        long n= (long)Math.pow(2,p)-1;
        long ans = ((n%mod) * power((n-1), n/2) );
        return (int)(ans%mod);
    }
    long power(long z, long y) 
    {
        long ans = 1;
        if (z == 0)
        {
          return 0;
        } 
        while (y > 0) 
        {
          if (y %2 != 0) ans = ((ans%mod) * (z%mod)) % mod;
          y/=2;
          z = ((z%mod) * (z%mod)) % mod;
        }
        return (ans%mod);
  }
}