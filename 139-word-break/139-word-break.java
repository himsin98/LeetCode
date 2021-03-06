class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        return wordBreak(s, wordDict, 0, dp);
    }
    
    private boolean wordBreak(String s, List<String> wordDict, int i, int[] dp){
        if(i==s.length())
            return true;
        if(dp[i] != -1)
            return dp[i]==1;
        boolean result = false;
        for(String word: wordDict){
            int l = word.length();
            if(i+l <= s.length() && s.substring(i, i+l).equals(word)){
                result = result | wordBreak(s, wordDict, i+l, dp);
            }
        }
        dp[i]=result?1:0;
        return result;
    }
}