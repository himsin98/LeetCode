class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        HashMap<Integer,Integer> map =new HashMap<>();
                
        for(int i : nums1){
            for(int j : nums2){
                if(map.containsKey(i+j)){
                    map.put(i+j,map.get(i+j)+1);
                }else{
                    map.put(i+j,1);
                }
            }
        }
        
        for(int k : nums3){
            for(int l : nums4){
                if(map.containsKey(-(k+l))){
                    count+=map.get(-(k+l));
                }
            }
        }
        return count;
    }
}