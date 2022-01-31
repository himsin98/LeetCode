class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] i :accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }
            max = Math.max(max, sum); 
        }
        return max;
    }
}