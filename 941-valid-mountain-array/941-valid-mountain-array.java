class Solution {
    public boolean validMountainArray(int[] arr) {
        if( arr.length<3)
            return false;
        boolean tip = false;
        for(int i = 1; i< arr.length; i++){
            if(!tip && (arr[i] == arr[i-1]))
                return false;
            if(tip && (arr[i] >= arr[i-1]))
                return false;
            if(!tip && (arr[i] < arr[i-1])){
                if(i-1 == 0)
                    return false;
                tip = true;
            }
            
        }
        return tip;
    }
}