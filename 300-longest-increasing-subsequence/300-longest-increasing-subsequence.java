class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for (int num : nums){
            int i = Collections.binarySearch(sub, num);
            if (i < 0) i = -1*i-1;
            if (i == sub.size()) sub.add(num);
            else sub.set(i, num);
        }
        return sub.size();
    }
}