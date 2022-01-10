class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        int[] target = new int[26];
        for(char i : p.toCharArray())
            target[i-'a']++;
        char[] array = s.toCharArray();
        int[] buffer = go(array, p.length());
        if(Arrays.equals(buffer, target))
            res.add(0);
        
        for(int i = p.length(); i<array.length; i++){
            buffer[array[i-p.length()]-'a']--;
            buffer[array[i] - 'a']++;
            if(Arrays.equals(target, buffer))
                res.add(i-p.length()+1);
        }
        return res;
        
    }
    
    private int[] go(char[] array, int size){
        int[] buffer = new int[26];
        for(int i = 0; i<size; i++)
            buffer[array[i] - 'a']++;
        return buffer;
    }
    
}