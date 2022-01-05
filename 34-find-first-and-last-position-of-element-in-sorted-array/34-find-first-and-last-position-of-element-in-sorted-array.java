class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if(end<0) return new int[]{-1, -1};
        
        int mid = start + (end-start)/2;
        while(start<end){
            if(nums[mid]==target){
                if(nums[start] == target && nums[end] == target){
                    return new int[]{start, end};
                }
                if(nums[start] < target){
                    start++;
                }
                if(nums[end] > target){
                    end--;
                }
            }else if(nums[mid] < target){
                start = mid +1;
            }else{
                end = mid;
            }
            mid = start + (end-start)/2;
        }
        return nums[mid]==target?new int[]{mid, mid}: new int[]{-1,-1};   
    }
}