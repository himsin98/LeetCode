class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(nums[0] <= nums[n-1])
            return nums[0];
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid = start + end >> 1;
            if(nums[mid] < nums[0]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return nums[end];
    }
}