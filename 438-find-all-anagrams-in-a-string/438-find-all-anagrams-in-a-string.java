class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<s.length()+1-p.length(); i++){
            if(isAnagram(s.substring(i,i+p.length()), p)){
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean isAnagram(String s, String p){
        int[] arr = new int[26];
            for(int i = 0; i<s.length(); i++){
                arr[s.charAt(i)-'a']++;
                arr[p.charAt(i)-'a']--;
            }
            for(int i:arr){
                if(i != 0)
                    return false;
            }
            return true;
    }
}