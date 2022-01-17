class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length - 1){
            int max = 0;
            for(int i = left; i<= right; i++){
                max = Math.max(nums[i] + i, max);
            }
            left = right + 1;
            right = max;
            jump++;
        }
        return jump;
    }
}