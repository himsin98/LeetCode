class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, candidates, target, new ArrayList<>());
        return result;
    }
    
    public void backtrack(int index, int[] arr, int target, List<Integer> currList){
        if(target < 0)
            return;
        if(target == 0){
            result.add(new ArrayList(currList));
            return;
        }
        for(int i = index; i<arr.length; i++){
            currList.add(arr[i]);
            backtrack(i, arr, target-arr[i], currList);
            currList.remove(currList.size() - 1);
        }
        
    }
}