class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for(int num : nums){
            if(count == 0){
                major = num;
                count++;
            }else if(num != major){
                count--;
            }else{
                count++;
            }
        }
        return major;
    }
}