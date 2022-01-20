class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        for(int pile: piles){
            right = Math.max(right, pile);
        }
        while(left<right){
            int total_time = 0;
            int mid = left + (right - left)/2;
            for(int pile : piles){
                total_time += Math.ceil((double) pile / mid);
            }
            if(total_time <= h){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}