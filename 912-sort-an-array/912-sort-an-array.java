class Solution {
    public int[] sortArray(int[] nums) {
        qSort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void qSort(int[] nums, int left, int right){
        if(left>=right)
            return;
        int pivotIndex = pivot(nums, left, right);
        qSort(nums, left, pivotIndex-1);
        qSort(nums, pivotIndex+1, right);
    }
    
    private int pivot(int[] nums, int start, int end){
        
        int pivot = nums[start];
        int swpIndex = start;
        for(int i = start+1; i<=end; i++){
            if(pivot > nums[i]){
                swpIndex++;
                swap(nums, swpIndex, i);
            }
        }
        swap(nums, swpIndex, start);
        return swpIndex;
    }
    
    private void swap(int[] nums, int swpIndex, int start){
        int temp = nums[swpIndex];
        nums[swpIndex] = nums[start];
        nums[start] = temp;
    }
}