class Solution {
    public List<String> letterCombinations(String digits) {
        String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        solution(list,"",digits,0,letters);
        return list;
    }
    public void solution(List<String> list,String up,String dig,int s,String[] letters){
        if(up.length()==dig.length()){
            list.add(up);
            return;
        }
        int ch = (int) dig.charAt(s)-'0';
        for(int i=0;i<letters[ch].length();i++){
            char cha=letters[ch].charAt(i);
  
            solution(list,up+cha,dig,s+1,letters);
        }
    }
}