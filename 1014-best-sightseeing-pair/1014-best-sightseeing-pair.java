class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxTn = values[0] + 0;
        int finAns = 0;
        for(int i = 1; i< values.length; i++){
            finAns = Math.max(finAns, values[i]-i+maxTn);
            maxTn = Math.max(maxTn, values[i]+i);
        }
        return finAns;
    }
}