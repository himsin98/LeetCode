class Solution {
    public int integerBreak(int n) {
        int num_3, ans;
        if(n==2) return 1;
        else if(n==3) return 2;
        
        if(n%3 == 0){
            num_3 = n/3;
            ans = (int)Math.pow(3, num_3);
            return ans;
        }else if(n%3 == 1){
            num_3 = n/3 - 1;
            ans = (int)Math.pow(3, num_3)*4;
            return ans;
        }else{
            num_3 = n/3;
            ans = (int)Math.pow(3, num_3)*2;
            return ans;
        }
    }
}