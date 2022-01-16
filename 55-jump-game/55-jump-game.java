class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int i = 0;
        while(i<n){
            if(pos<i)
                return false;
            if(pos < i + nums[i])
                pos = i + nums[i];
            if(pos >= n-1)
                return true;
            i++;
        }
        return false;
    }
}