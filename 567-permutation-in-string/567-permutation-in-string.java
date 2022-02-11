class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        for(int i = 0; i<=s2.length()-s1.length(); i++){
            if(checkString(s2.substring(i, i+s1.length()), s1)){
                return true;
            }
        }
        return false;
    }
    
    private boolean checkString(String s, String t){
        int[] arr = new int[26];
        for(int i = 0; i<t.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i: arr){
            if(i!=0)
                return false;
        }
        return true;
    }
}