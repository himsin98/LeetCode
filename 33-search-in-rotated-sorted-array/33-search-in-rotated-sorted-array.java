class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, left = 0, right = n-1;
        while(left < right){
            int mid = left + right >> 1;
            if(nums[mid] < nums[0]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        if(nums[0] <= target){
            left = 0;
            if(right != n-1)
                --right;
        }else{
            left = right;
            right = n-1;
        }
        while(left < right){
            int mid = left+right >> 1;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return nums[right]==target?right:-1;
    }
}