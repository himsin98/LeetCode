class Solution {
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        List<Integer> list=howSum(coins,amount);
        return list!=null?list.size():-1;
    }
    public List<Integer> howSum(int[] ar,int target)
    {
        if(target==0)return new ArrayList<>();
        if(target<0)return null;
        if(map.containsKey(target))return map.get(target);
        List<Integer> res=null;
        for(int i=0;i<ar.length;i++)
        {
            List<Integer> list=howSum(ar,target-ar[i]);
            if(list!=null)
            {
                List<Integer> temp=new ArrayList<>(list);
                temp.add(ar[i]);
                if(res==null || res.size()>temp.size())
                    res=new ArrayList<>(temp);
            }
        }
        map.put(target,res);
        return res;
        
    }
}