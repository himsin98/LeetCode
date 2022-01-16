class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev="";
        int len=s.length();
        for(int i=len-1;i>=0;i--)rev+=s.charAt(i);
        int[][] dp=new int[len+1][len+1];
        for(int i=len-1;i>=0;i--)
            for(int j=len-1;j>=0;j--)
            {
                if(s.charAt(i)==rev.charAt(j))dp[i][j]=dp[i+1][j+1]+1;
                else
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        return dp[0][0];
    }
}