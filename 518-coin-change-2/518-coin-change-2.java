class Solution {
    public int change(int amount, int[] coins) {
        int[] dp=new int[10010];
        
		// initialize
        for(int i=0 ; i<=amount ; i++){
            dp[i]=0;
        }
        
		// First state
        dp[0]=1;
		// For each kind of coin
        for(int i=0 ; i<coins.length ; i++){
			// For each price with every kind of coin
            for(int j=coins[i] ; j<=amount ; j++){
                dp[j] += dp[j - coins[i]];
            }
        }
        
        return dp[amount];
    }
}