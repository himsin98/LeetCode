class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<> ();
    
    int temp_low =String.valueOf(low).length();
    
    int temp_high=String.valueOf(high).length();
    
    String nums = "123456789";
    
    while(temp_low <= temp_high)
    {
        for(int i=0;i<=9-temp_low;i++)
        {
            int temp_num= Integer.parseInt(nums.substring(i,i+temp_low));
            
            if(low<=temp_num && temp_num<=high)
                result.add(temp_num);
        }
        temp_low++;
        
        
    }
    
    return result;
}
}