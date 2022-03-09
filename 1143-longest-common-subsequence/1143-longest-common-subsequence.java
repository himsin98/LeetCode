class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int[][] mem = new int[s.length()][t.length()];
        for(int i = 0; i< s.length(); i++){
            Arrays.fill(mem[i], -1);
        }
        
        return lcs(s, t, 0, 0, mem);
    }
    
    private int lcs(String s1, String s2, int l1, int l2, int[][] mem){
        if(l1 == s1.length() || l2 == s2.length())
            return 0;
        if(mem[l1][l2] != -1)
            return mem[l1][l2];
        
        if(s1.charAt(l1) == s2.charAt(l2)){
            mem[l1][l2] = 1 + lcs(s1, s2, l1+1, l2+1, mem);
        }else{
            //String s = lcs(s1, s2, l1+1, l2, mem);
            //String t = lcs(s1, s2, l1, l2+1, mem);
            mem[l1][l2] = Math.max(lcs(s1, s2, l1+1, l2, mem), lcs(s1, s2, l1, l2+1, mem));
        }
        return mem[l1][l2];
    }
}