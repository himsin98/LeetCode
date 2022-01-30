class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int num = 0;
        for(int i = 0; i<s.length; i++){
            if(q<=e[i] && q>=s[i])
                num++;
        }
        return num;
    }
}