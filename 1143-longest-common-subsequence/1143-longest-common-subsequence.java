class Solution {
    public int longestCommonSubsequence(String s, String t) {
        String[][] mem = new String[s.length()][t.length()];
        return lcs(s, t, 0, 0, mem).length();
    }
    
    private String lcs(String s1, String s2, int l1, int l2, String[][] mem){
        if(l1 == s1.length() || l2 == s2.length())
            return "";
        if(mem[l1][l2] != null)
            return mem[l1][l2];
        
        if(s1.charAt(l1) == s2.charAt(l2)){
            mem[l1][l2] = 1 + lcs(s1, s2, l1+1, l2+1, mem);
        }else{
            String s = lcs(s1, s2, l1+1, l2, mem);
            String t = lcs(s1, s2, l1, l2+1, mem);
            mem[l1][l2] = s.length() > t.length()?s:t;
        }
        return mem[l1][l2];
    }
}