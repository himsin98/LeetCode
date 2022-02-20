class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals,(a,b)->a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int end = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][1] <= end)count++;
            end = Math.max(end,intervals[i][1]);
        }
        return intervals.length - count;
    }
}