class Solution {
    public boolean wordPattern(String pattern, String s) {
	    String[] arr = s.split(" ", 0);
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        if(arr.length != pattern.length())
            return false;
        for(int i = 0; i< pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(!map2.containsKey(arr[i])){
                    map.put(pattern.charAt(i), arr[i]);
                    map2.put(arr[i], pattern.charAt(i));
                }else{
                    return false;
                }
                
            }else if(!map.get(pattern.charAt(i)).equals(arr[i])){
                return false;
            }
        }
        return true;
    }
}