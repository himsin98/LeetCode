class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] arr = new int[2];
        for(int i = 0; i<s.length(); i++){
            if((arr[1] + widths[s.charAt(i) - 'a']) > 100){
                arr[0] += 1;
                arr[1] = widths[s.charAt(i) - 'a'];
                continue;
            }
            arr[1] += widths[s.charAt(i) - 'a'];
        }
        
        arr[0] += 1;
        return arr;
    }
}