class Solution {
    int[][] memo;    
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        memo = new int[n+1][];
        
        for(int i = 0; i<=n; i++){
            memo[i] = new int[i+1];
            for(int j = 0; j<=i; j++){
                memo[i][j] = -1;
            }
        }
        return dp(triangle, 0, 0);
    }
    
    int dp(List<List<Integer>> triangle, int row, int index){
        if(row >= triangle.size())
            return 0;
        if(memo[row][index] != -1)
            return memo[row][index];
        int res = triangle.get(row).get(index) + Math.min(dp(triangle, row+1, index), dp(triangle, row+1, index+1));
        memo[row][index] = res;
        return res;
    }
}