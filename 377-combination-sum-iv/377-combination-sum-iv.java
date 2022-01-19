class Solution {
    public int combinationSum4(int[] nums, int target) {
    
        int[] dp = new int[target+1];
        dp[0] = 1;
        
        for(int c=1; c<dp.length; c++){
            for(int n=0; n<nums.length; n++){
                if(c-nums[n]>=0){
                dp[c]+=dp[c-nums[n]];
                }
            }
        }
        return dp[target];
    }
}