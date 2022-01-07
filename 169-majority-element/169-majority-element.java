class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int major = nums.length/2;
        for(int i = 1; i< nums.length; i++){
            if(map.containsKey(nums[i]) && (map.get(nums[i]) + 1 > major))
                return nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return nums[0];
    }
}