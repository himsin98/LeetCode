class Solution {
    public int addDigits(int num) {
        int digit = 0;
        while(num != 0){
            digit += num%10;
            if(digit > 9){
                digit = digit%10 + 1;
            }
            num=num/10;
        }
        return digit;
    }
}