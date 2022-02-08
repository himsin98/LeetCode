class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        if(nums[0] < nums[len-1]){
            for(int i = 1; i< len; i++){
                if(nums[i] < nums[i-1])
                    return false;
            }
        }else{
            int i = 0;
            for(i = 1; i<len; i++){
                if(nums[i]<nums[i-1])
                    break;
            }
            for(i=i+1;i<len; i++){
                if(nums[i] < nums[i-1])
                    return false;
            }
        }
        return true;
    }
}