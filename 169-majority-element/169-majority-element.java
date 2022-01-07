class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maj = 0;
        for(int i : nums)
            if(count == 0){
                maj = i;
                count++;
            }else if(i == maj){
                count++;
            }else{
                count--;
            }
        return maj;
    }
}