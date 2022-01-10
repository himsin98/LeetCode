class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(target < 1)
            return 0;
        int sum = 0, ans = Integer.MAX_VALUE, left = 0;
        for(int right = 0; right<nums.length; right++){
            sum += nums[right];
            while(sum > target){
                sum -= nums[left++];
            }
            if(sum == target){
                ans = Math.min(right-left + 1, ans);
            }else if(left > 0){
                sum += nums[--left];
                ans = Math.min(right-left+1, ans);
            }
            
        }
        return ans>nums.length?0:ans;
    }
}