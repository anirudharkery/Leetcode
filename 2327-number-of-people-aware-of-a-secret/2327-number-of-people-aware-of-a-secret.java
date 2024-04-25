class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
          long modulo = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long countOfCanSpeak = 0;

        for(int i = 2; i < dp.length; i++) {
            int forgetIndex = i - forget;
            int delayIndex = i - delay;

            if (forgetIndex > 0){
                countOfCanSpeak -= dp[forgetIndex];
            }

            if (delayIndex > 0) {
                countOfCanSpeak += dp[delayIndex];
            }

            dp[i] = countOfCanSpeak % modulo;
        }

        long answer = 0;
        for(int i = n - forget + 1; i < dp.length; i++) {
            answer += dp[i];
        }

        return (int) (answer % modulo);
    }
}