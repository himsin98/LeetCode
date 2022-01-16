class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:str){
            char[]temp=s.toCharArray();
            Arrays.sort(temp);
            String key=new String(temp);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
