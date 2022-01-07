class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3){
            return list;
        }
        for(int i = 0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while ( j<k && nums[j] == nums[j - 1]) j++;  
                    while (j<k && nums[k] == nums[k + 1]) k--;
                }else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return list;
    }
}