class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        nums = reverse(nums, 0, n-k-1);
        nums = reverse(nums, n-k, n-1);
        nums = reverse(nums, 0, n-1);
    }
    public int[] reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}