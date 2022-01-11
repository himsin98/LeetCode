class Solution {
    public boolean increasingTriplet(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        for(int i : nums){
            if(start >= i)   start = i; // maxValue > 1 --> start = i  || also || 1 !> 2 --> move on
            else if(end >= i)    end = i;   // 2 > 1 -->  end = i || also || 2 !> 3 --> move on
            else return true; // third sequence term enters here and return true
        }
        return false;
    }
}