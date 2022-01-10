class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = getString(s);
        String s2 = getString(t);
        return s1.equals(s2)?true:false;
    }
    
    private String getString(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s.charAt(i));
            }
            i++;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}