class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        calculate(0,nums,res,new ArrayList<>());
        return res;
        
    }
    public static void calculate(int curr,int arr[],List<List<Integer>>res,List<Integer>subresults)
    {
         res.add(new ArrayList<>(subresults));
         for(int i=curr;i<arr.length;i++)
         {
             if(i!=curr && arr[i]==arr[i-1])
             {
                 continue;
             }
             subresults.add(arr[i]);
             calculate(i+1,arr,res,subresults);
             subresults.remove(subresults.size()-1);
         }
        
    }
}